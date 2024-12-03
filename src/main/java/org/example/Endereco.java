package org.example;

public class Endereco {
    private final String rua;
    private final int numero;
    private final String cidade;

    public Endereco(String rua, int numero, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return rua + ", " + numero + ", " + cidade;
    }
}
