package org.example;

import java.time.Duration;

public class CalcularTempoDeEspera {
    public Duration calcular(Pedido pedido) {
        // Tempo base fixo de 30 minutos para entrega
        return Duration.ofMinutes(30);
    }
}
