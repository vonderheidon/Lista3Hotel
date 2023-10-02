package br.com.fescfafic.hotel.Model;

public class Executivo extends HospedeRegular {
    public Executivo(String nome, String cpf, String sexo, int idade, boolean possuiNecessidadesEspeciais, boolean possuiPet) {
        super(nome, cpf, sexo, idade, possuiNecessidadesEspeciais, possuiPet);
    }
}
