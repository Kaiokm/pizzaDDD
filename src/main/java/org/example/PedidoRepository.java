package org.example;

import java.util.HashMap;
import java.util.Map;

public interface PedidoRepository {
    void salvar(Pedido pedido);
    Pedido obterPorId(int id);
}

class RepositorioPedidoEmMemoria implements PedidoRepository {
    private final Map<Integer, Pedido> pedidos = new HashMap<>();

    @Override
    public void salvar(Pedido pedido) {
        pedidos.put(pedido.getId(), pedido);
    }

    @Override
    public Pedido obterPorId(int id) {
        return pedidos.get(id);
    }
}
