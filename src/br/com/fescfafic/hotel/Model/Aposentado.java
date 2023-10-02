package br.com.fescfafic.hotel.Model;

public class Aposentado extends HospedeIdoso {
    public Aposentado(String nome, String cpf, String sexo, int idade, boolean possuiNecessidadesEspeciais, boolean precisaCadeiraDeRodas) {
        super(nome, cpf, sexo, idade, possuiNecessidadesEspeciais, precisaCadeiraDeRodas);
    }
}
