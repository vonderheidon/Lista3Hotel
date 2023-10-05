package br.com.fescfafic.hotel.Main;

import br.com.fescfafic.hotel.Model.*;


public class Main {
    public static void main(String[] args) {
        QuartoCompartilhado quartoCompartilhado = new QuartoCompartilhado(
                25,
                34,
                true,
                3,
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
        hotel.adicionarQuarto(quartoLuxo);
        hotel.adicionarQuarto(quartoCompartilhado);
        hotel.adicionarQuarto(quartoSimples);
        hotel.fazerReserva(25, adolescente);
        hotel.fazerReserva(25, adolescente);
        hotel.fazerReserva(25, adolescente);
        hotel.fazerReserva(25, adolescente);
        hotel.fazerReserva(25, adolescente);
        hotel.fazerReserva(25, adolescente);
    }
}