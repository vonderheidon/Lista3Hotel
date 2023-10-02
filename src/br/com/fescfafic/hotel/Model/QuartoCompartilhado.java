package br.com.fescfafic.hotel.Model;

public class QuartoCompartilhado extends Quarto{
    public int qtdArmarios;
    public int camasReservadas;
    public Hospede[] listaHospedes;
    public QuartoCompartilhado(int numeroQuarto, int qtdCama, double precoPorNoite, boolean disponibilidade, boolean possuiFrigobar, int qtdArmarios) {
        super(numeroQuarto, qtdCama, precoPorNoite, disponibilidade, possuiFrigobar);
        this.qtdArmarios = qtdArmarios;
        this.camasReservadas = 0;
        this.listaHospedes = new Hospede[qtdCama];
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.printf("\nQuantidade de armarios: %d", this.qtdArmarios);
    }
    @Override
    public boolean verificarDisponibilidade() {
        int camasDisponiveis = super.qtdCama - this.camasReservadas;
        if (camasDisponiveis > 0) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public void reservarQuarto() {
        if (this.verificarDisponibilidade() == true) {
            System.out.printf("\nUma cama do quarto compartilhado foi reservada com sucesso.");
            this.camasReservadas++;
            if (this.camasReservadas >= super.qtdCama) {
                super.disponibilidade = false;
            }
        } else {
            System.out.printf("\nNao foi possivel reservar uma cama do quarto compartilhado, estao todas ocupadas.");
        }
    }
}
