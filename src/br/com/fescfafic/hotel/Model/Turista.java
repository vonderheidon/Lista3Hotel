package br.com.fescfafic.hotel.Model;

public class Turista extends HospedeRegular {
    public Turista(String nome, String cpf, String sexo, int idade, boolean possuiNecessidadesEspeciais, boolean possuiPet) {
        super(nome, cpf, sexo, idade, possuiNecessidadesEspeciais, possuiPet);
    }
}
