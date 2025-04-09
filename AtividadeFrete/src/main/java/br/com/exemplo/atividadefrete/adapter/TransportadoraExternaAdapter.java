package br.com.exemplo.atividadefrete.adapter;

import br.com.exemplo.atividadefrete.externotransportadora.APITransportadoraExterna;
import br.com.exemplo.atividadefrete.strategy.FreteStrategy;
import org.springframework.stereotype.Component;

@Component
public class TransportadoraExternaAdapter implements FreteStrategy {

    private final APITransportadoraExterna apiExterna;

    public TransportadoraExternaAdapter() {
        this.apiExterna = new APITransportadoraExterna();
    }

    @Override
    public double calcular(double peso) {
        return apiExterna.calcularCustoEnvio(peso);
    }

    @Override
    public String tipo() {
        return "externa";
    }
}