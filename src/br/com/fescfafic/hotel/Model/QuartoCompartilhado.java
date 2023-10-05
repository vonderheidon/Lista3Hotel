package br.com.fescfafic.hotel.Model;

public class QuartoCompartilhado extends Quarto{
    public int qtdCama;
    public int camasReservadas;
    public int qtdArmarios;
    public boolean possuiFrigobar;
    public boolean forneceToalhas;
    public Hospede[] listaHospedes;
    public QuartoCompartilhado(int numeroQuarto, double precoPorNoite, boolean disponibilidade, int qtdCama,
                               int qtdArmarios, boolean possuiFrigobar, boolean forneceToalhas) {
        super(numeroQuarto, precoPorNoite, disponibilidade);
        super.tipo = "Compartilhado";
        this.qtdCama = qtdCama;
        this.camasReservadas = 0;
        this.qtdArmarios = qtdArmarios;
        this.possuiFrigobar = possuiFrigobar;
        this.forneceToalhas = forneceToalhas;
        this.listaHospedes = new Hospede[qtdCama];
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.printf("\nQuantidade de camas: %d\n", this.qtdCama);
        System.out.printf("Quantidade de armarios: %d\n", this.qtdArmarios);
        System.out.printf("Possui frigobar: %s\n", this.possuiFrigobar ? "Sim" : "Nao");
        System.out.printf("Fornece toalhas: %s", this.forneceToalhas ? "Sim" : "Nao");
    }
    @Override
    public boolean verificarDisponibilidade() {
        int camasDisponiveis = this.qtdCama - this.camasReservadas;
        if (camasDisponiveis > 0) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public void reservarQuarto() {
        this.camasReservadas++;
        if (this.camasReservadas >= this.qtdCama) {
            super.disponibilidade = false;
        }
    }
    public void adicionarHospede(Hospede hospede) {
        for (int i = 0; i < this.listaHospedes.length; i++) {
            if (this.listaHospedes[i] == null) {
                this.listaHospedes[i] = hospede;
                System.out.printf("\nO hospede %s foi adicionado ao quarto nº %d.", hospede.nome, this.numeroQuarto);
                return;
            }
        }
    }
}
