package br.com.fescfafic.hotel.Model;

public class QuartoSimples extends Quarto{
    public boolean possuiArCondicionado;
    public Hospede[] listaHospedes;
    public QuartoSimples() {

        super.tipo = "Simples";
        this.possuiArCondicionado = possuiArCondicionado;
        this.listaHospedes = new Hospede[qtdHospedes];
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.printf("\nPossui ar-condicionado: %s\n", this.possuiArCondicionado ? "Sim" : "Nao");
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
