package br.com.fescfafic.hotel.Model;

public class Quarto {
    public int numeroQuarto;
    public double precoPorNoite;
    public boolean disponibilidade;
    public String tipo;

    public Quarto (int numeroQuarto, double precoPorNoite, boolean disponibilidade) {
        this.numeroQuarto = numeroQuarto;
        this.precoPorNoite = precoPorNoite;
        this.disponibilidade = disponibilidade;
    }

    public void exibirInfo() {
        System.out.printf("\nNumero do quarto: %d\n", this.numeroQuarto);
        System.out.printf("Preco por noite: R$ %.2f\n", this.precoPorNoite);
        System.out.printf("Disponibilidade: %s\n", this.disponibilidade ? "Disponivel" : "Indisponivel");
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
        }
    }
    public void adicionarHospede(Hospede hospede) {
        System.out.printf("\nAdicionando hospede %s", hospede.nome);
    }
}
