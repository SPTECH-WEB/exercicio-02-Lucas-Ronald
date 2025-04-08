package br.com.exemplo.atividadefrete.controller;

import br.com.exemplo.atividadefrete.service.FreteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/frete")
public class FreteController {
    private final FreteService freteService;
    public FreteController(FreteService freteService) {
        this.freteService = freteService;
    }

    @GetMapping("/calcular")
    public ResponseEntity<String> calcularFrete(@RequestParam String tipo, @RequestParam double peso){
        double valor = freteService.calcular(tipo, peso);
        return ResponseEntity.ok("Frete ("+ tipo +") para " + peso + "Kg: R$ " + valor);
    }
}
