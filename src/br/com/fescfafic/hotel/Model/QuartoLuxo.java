package br.com.fescfafic.hotel.Model;

public class QuartoLuxo extends Quarto {
    public boolean possuiHidromassagem;
    public Hospede[] listaHospedes;
    public QuartoLuxo(int numeroQuarto, int qtdCama, double precoPorNoite, boolean disponibilidade,
                      boolean possuiFrigobar, boolean possuiHidromassagem, int qtdHospedes) {
        super(numeroQuarto, qtdCama, precoPorNoite, disponibilidade, possuiFrigobar);
        super.tipo = "Luxo";
        this.possuiHidromassagem = possuiHidromassagem;
        this.listaHospedes = new Hospede[qtdHospedes];
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.printf("\nPossui hidromassagem: %s", this.possuiHidromassagem ? "Sim" : "Nao");
    }
}
