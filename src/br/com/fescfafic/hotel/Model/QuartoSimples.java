package br.com.fescfafic.hotel.Model;

public class QuartoSimples extends Quarto{
    public boolean possuiArCondicionado;
    public Hospede[] listaHospedes;
    public QuartoSimples(int numeroQuarto, int qtdCama, double precoPorNoite, boolean disponibilidade,
                         boolean possuiFrigobar, boolean possuiArCondicionado, int qtdHospedes) {
        super(numeroQuarto, qtdCama, precoPorNoite, disponibilidade, possuiFrigobar);
        super.tipo = "Simples";
        this.possuiArCondicionado = possuiArCondicionado;
        this.listaHospedes = new Hospede[qtdHospedes];
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.printf("\nPossui ar-condicionado: %s", this.possuiArCondicionado ? "Sim" : "Nao");
    }
}
