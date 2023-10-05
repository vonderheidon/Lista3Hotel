package br.com.fescfafic.hotel.Main;

import br.com.fescfafic.hotel.Model.*;


public class Main {
    public static void main(String[] args) {
        QuartoLuxo quartoLuxo = new QuartoLuxo(
                33,
                150,
                true,
                true,
                true,
                3,
                true,
                true,
                2
        );
        QuartoCompartilhado quartoCompartilhado = new QuartoCompartilhado(
                25,
                34,
                true,
                8,
                3,
                true,
                false
        );
        Hotel hotel = new Hotel(
                "Beira mar",
                "Rua pirilompas",
                3,
                1,
                true,
                3
        );
        Adolescente adolescente = new Adolescente(
                "Felipe",
                "404004",
                "Masculino",
                16,
                false,
                false
        );
        Aposentado aposentado = new Aposentado(
                "Jurandir",
                "3030303",
                "Masculino",
                87,
                true,
                true
        );
        hotel.adicionarQuarto(quartoLuxo);
        hotel.adicionarQuarto(quartoCompartilhado);
        hotel.exibirInfo();
        System.out.printf("\n----------------------------\n");
        adolescente.exibirInfo();
        System.out.printf("\n----------------------------\n");
        hotel.fazerReserva(25, adolescente);
        hotel.fazerReserva(25, aposentado);
        System.out.printf("\n----------------------------\n");
        quartoLuxo.exibirInfo();
    }
}