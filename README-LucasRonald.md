# Sistema de Cálculo de Frete

Este projeto é um sistema simples feito com **Java e Spring Boot** que calcula o valor do frete com base no tipo de entrega escolhido.

---

## O que esse sistema faz?

- Calcula o valor do frete de forma automática
- Permite escolher entre 3 tipos de entrega:
  - **Expressa**
  - **Econômica**
  - **Transportadora terceirizada**
  - **Transportadora externa ("API")**
- Notifica o cliente e a equipe interna quando a entrega é concluída
- Usa boas práticas com **padrões de projeto** para deixar o código organizado e fácil de expandir

---

## Como usar

### Requisição:

```
GET http://localhost:8080/frete/calcular?tipo=economica&peso=10.0
```

### Resposta:

Frete (economica) para 10.0Kg: R$ 30.0

---

### Strategy Pattern – Cálculo de Frete

Cada tipo de entrega tem uma regra diferente. O sistema escolhe a estratégia certa com base no tipo enviado.

- `FreteExpressa.java`
- `FreteEconomica.java`
- `FreteTercerizada.java`

---

### Adapter Pattern – Integração com transportadora

A transportadora terceirizada usa uma API diferente do sistema. Um **adaptador** foi criado para fazer essa integração funcionar sem bagunçar o código.

- `APITransportadoraExterna.java`
- `TransportadoraExternaAdapter.java`

---

### Observer Pattern – Notificações

Quando o frete é concluído, o sistema **avisa automaticamente** quem precisa ser informado (ex: cliente, equipe interna).

- `NotificaCliente.java`
- `NotificaEquipeInterna.java`
- `NotificacaoEntrega.java`

---

## Organização do projeto

```
atividadefrete/
├── controller/          → Controla as requisições
├── service/             → Regras de negócio
├── strategy/            → Tipos de cálculo de frete
├── observer/            → Notificações
├── externotransportadora/ → Simula uma API externa
```

---

## Autor

Projeto feito por **Lucas Ronald** para praticar padrões de projeto em Java.
