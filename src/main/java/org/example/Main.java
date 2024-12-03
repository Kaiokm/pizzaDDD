package org.example;

import java.time.Duration;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Criando o endereço e o pedido
        Endereco endereco = new Endereco("Rua das Pizzas", 123, "João Pessoa");
        List<String> itens = List.of("Pizza de Calabresa", "Refrigerante");
        Pedido pedido = new Pedido(1, "Kaio", endereco, itens);

        // Criando o repositório e salvando o pedido
        PedidoRepository repositorio = new RepositorioPedidoEmMemoria();
        repositorio.salvar(pedido);

        // Calculando o tempo estimado de entrega
        CalcularTempoDeEspera servicoEntrega = new CalcularTempoDeEspera();
        Duration tempoEstimado = servicoEntrega.calcular(pedido);

        // Exibindo informações
        System.out.println(pedido);
        System.out.println("Tempo estimado de entrega: " + tempoEstimado.toMinutes() + " minutos");
    }
}