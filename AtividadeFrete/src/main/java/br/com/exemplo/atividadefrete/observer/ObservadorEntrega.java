package br.com.exemplo.atividadefrete.observer;

public interface ObservadorEntrega {
    void notificar(String tipo, double peso, double valor);
}