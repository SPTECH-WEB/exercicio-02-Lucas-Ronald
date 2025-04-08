package br.com.exemplo.atividadefrete.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class FreteService {
    private final List<FreteStrategy> estrategias;
    public FreteService(List<FreteStrategy> estrategias) {
        this.estrategias = estrategias;
    }

    public double calcular(String tipo, double peso) {
        return estrategias.stream()
                .filter(e -> e.tipo()
                        .equalsIgnoreCase(tipo))
                .findFirst()
                .orElseThrow(()->new IllegalArgumentException("Tipo de Frete inválido"))
                .calcular(peso);
    }
}
