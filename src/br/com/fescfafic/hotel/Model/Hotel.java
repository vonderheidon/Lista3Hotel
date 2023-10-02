package br.com.fescfafic.hotel.Model;

public class Hotel {
    public String nome;
    public String endereco;
    public int qtdAndares;
    public int qtdRestaurantes;
    public boolean possuiPiscina;
    public Quarto[] listaQuartos;

    public Hotel(String nome, String endereco, int qtdAndares, int qtdRestaurantes, boolean possuiPiscina, int qtdQuartos) {
        this.nome = nome;
        this.endereco = endereco;
        this.qtdAndares = qtdAndares;
        this.qtdRestaurantes = qtdRestaurantes;
        this.possuiPiscina = possuiPiscina;
        this.listaQuartos = new Quarto[qtdQuartos];
    }
}
