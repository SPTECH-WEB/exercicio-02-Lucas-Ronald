package br.com.exemplo.atividadefrete.service;

import org.springframework.stereotype.Component;

@Component
public class FreteEconomica implements FreteStrategy {
    @Override
    public double calcular(double peso) {
        return 3.0 * peso;
    }

    @Override
    public String tipo() {
        return "Econômica";
    }
}
