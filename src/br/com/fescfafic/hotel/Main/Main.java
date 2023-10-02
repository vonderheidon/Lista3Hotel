package br.com.fescfafic.hotel.Main;

import br.com.fescfafic.hotel.Model.*;


public class Main {
    public static void main(String[] args) {
        QuartoCompartilhado quartoCompartilhado = new QuartoCompartilhado(
                25,
                5,
                22.50,
                true,
                false,
                5
        );
        QuartoLuxo quartoLuxo = new QuartoLuxo(
                26,
                2,
                76,
                true,
                true,
                true,
                3
        );
        QuartoSimples quartoSimples = new QuartoSimples(
                27,
                1,
                40.30,
                true,
                true,
                false,
                2
        );
        Hotel hotel = new Hotel(
                "Beira mar",
                "Rua pirilompas",
                3,
                1,
                true,
                3
        );
        hotel.adicionarQuarto(quartoLuxo);
        hotel.adicionarQuarto(quartoCompartilhado);
        hotel.adicionarQuarto(quartoSimples);
        hotel.exibirInfo();
    }
}