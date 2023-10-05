package br.com.fescfafic.hotel.Model;

public class QuartoLuxo extends Quarto {
    public boolean possuiHidromassagem;
    public boolean possuiVaranda;
    public int qtdBanheiros;
    public boolean forneceRoupoes;
    public boolean possuiMiniBar;
    public Hospede[] listaHospedes;
    public QuartoLuxo(int numeroQuarto, double precoPorNoite, boolean disponibilidade, boolean possuiHidromassagem,
                      boolean possuiVaranda, int qtdBanheiros, boolean forneceRoupoes, boolean possuiMiniBar, int qtdHospedes) {
        super(numeroQuarto, precoPorNoite, disponibilidade);
        super.tipo = "Luxo";
        this.possuiHidromassagem = possuiHidromassagem;
        this.possuiVaranda = possuiVaranda;
        this.qtdBanheiros = qtdBanheiros;
        this.forneceRoupoes = forneceRoupoes;
        this.possuiMiniBar = possuiMiniBar;
        this.listaHospedes = new Hospede[qtdHospedes];
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.printf("Possui hidromassagem: %s\n", this.possuiHidromassagem ? "Sim" : "Nao");
        System.out.printf("Possui varanda: %s\n", this.possuiVaranda ? "Sim" : "Nao");
        System.out.printf("Quantidade de banheiros: %d\n", this.qtdBanheiros);
        System.out.printf("Fornece roupoes: %s\n", this.forneceRoupoes ? "Sim" : "Nao");
        System.out.printf("Possui mini-bar: %s", this.possuiMiniBar ? "Sim" : "Nao");
    }
    @Override
    public boolean verificarDisponibilidade() {
        for (int i = 0; i < this.listaHospedes.length; i++) {
            if (this.listaHospedes[i] == null) {
                return true;
            }
        }
        return false;
    }
    @Override
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
