package br.com.fescfafic.hotel.Model;

public class Quarto {
    public int numeroQuarto;
    public int qtdCama;
    public double precoPorNoite;
    public boolean disponibilidade;
    public boolean possuiFrigobar;
    public String tipo;

    public Quarto (int numeroQuarto, int qtdCama, double precoPorNoite, boolean disponibilidade, boolean possuiFrigobar) {
        this.numeroQuarto = numeroQuarto;
        this.qtdCama = qtdCama;
        this.precoPorNoite = precoPorNoite;
        this.disponibilidade = disponibilidade;
        this.possuiFrigobar = possuiFrigobar;
    }

    public void exibirInfo() {
        System.out.printf("\nNumero do quarto: %d\n", this.numeroQuarto);
        System.out.printf("Quantidade de camas: %d\n", this.qtdCama);
        System.out.printf("Preco por noite: R$ %.2f\n", this.precoPorNoite);
        System.out.printf("Disponibilidade: %s\n", this.disponibilidade ? "Disponivel" : "Indisponivel");
        System.out.printf("Possui frigobar: %s", this.possuiFrigobar ? "Sim" : "Nao");
    }
    public boolean verificarDisponibilidade() {
        if (this.disponibilidade == true) {
            return true;
        } else {
            return false;
        }
    }
    public void reservarQuarto() {
        if (this.verificarDisponibilidade() == true) {
            this.disponibilidade = false;
            System.out.printf("\nO quarto %d foi reservado com sucesso.", this.numeroQuarto);
        } else {
            System.out.printf("\nO quarto %d ja possui reserva, nao foi possivel concluir a acao.", this.numeroQuarto);
        }
    }
}
