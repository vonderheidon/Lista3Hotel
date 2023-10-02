package br.com.fescfafic.hotel.Main;

import br.com.fescfafic.hotel.Model.Quarto;
import br.com.fescfafic.hotel.Model.QuartoCompartilhado;
import br.com.fescfafic.hotel.Model.QuartoLuxo;


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
    }
}