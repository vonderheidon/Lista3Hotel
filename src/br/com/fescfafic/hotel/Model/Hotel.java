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

    public void exibirInfo() {
        System.out.printf("\nNome: %s\n", this.nome);
        System.out.printf("Endereco: %s\n", this.endereco);
        System.out.printf("Quantidade de andares: %d\n", this.qtdAndares);
        System.out.printf("Possui piscina: %s", this.possuiPiscina ? "Sim" : "Nao");
        this.listarQuartos();
    }
    public void adicionarQuarto(Quarto quarto) {
        for (int i = 0; i < this.listaQuartos.length; i++) {
            if (this.listaQuartos[i] == null) {
                this.listaQuartos[i] = quarto;
                return;
            }
        }
        System.out.print("\nNao foi possivel adicionar o quarto, quantidade maxima atingida.");
    }
    public void listarQuartos() {
        boolean temQuarto = false;
        System.out.printf("\nLista de quartos: ");
        for (int i = 0; i < this.listaQuartos.length; i++) {
            if (this.listaQuartos[i] != null) {
                System.out.printf("\n - Quarto nº %d, do tipo %s e esta %s.", this.listaQuartos[i].numeroQuarto,
                        this.listaQuartos[i].tipo, this.listaQuartos[i].disponibilidade ? "disponivel" : "indisponivel");
                temQuarto = true;
            }
        }
        if (temQuarto == false) {
            System.out.print("Esse hotel eh o primeiro do mundo que nao tem quartos.");
        }
    }
    public void fazerReserva() {

    }
}
