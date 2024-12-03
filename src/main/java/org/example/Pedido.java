package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final int id;
    private final String cliente;
    private final Endereco enderecoEntrega;
    private final List<String> itens;
    private final LocalDateTime dataHoraPedido;

    public Pedido(int id, String cliente, Endereco enderecoEntrega, List<String> itens) {
        this.id = id;
        this.cliente = cliente;
        this.enderecoEntrega = enderecoEntrega;
        this.itens = new ArrayList<>(itens);
        this.dataHoraPedido = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public Endereco getEnderecoEntrega() {
        return enderecoEntrega;
    }

    @Override
    public String toString() {
        return "Pedido " + id + " para " + cliente + ", entrega em " + enderecoEntrega +
                ", itens: " + itens + ", feito em: " + dataHoraPedido;
    }
}
