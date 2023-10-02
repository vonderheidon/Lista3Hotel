package br.com.fescfafic.hotel.Model;

public abstract class Hospede {
    public String nome;
    public String cpf;
    public String sexo;
    public int idade;
    public boolean possuiNecessidadesEspeciais;

    public Hospede(String nome, String cpf, String sexo, int idade, boolean possuiNecessidadesEspeciais) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.idade = idade;
        this.possuiNecessidadesEspeciais = possuiNecessidadesEspeciais;
    }

    public void exibirInfo() {
        System.out.printf("\nNome: %s\n", this.nome);
        System.out.printf("CPF: %s\n", this.cpf);
        System.out.printf("Sexo: %s\n", this.sexo);
        System.out.printf("Idade: %d\n", this.idade);
        System.out.printf("Possui pet?: %s", this.possuiNecessidadesEspeciais ? "Sim" : "Nao");
    }
    public void solicitarServicoDeQuarto() {
        System.out.printf("\nO cliente %s solicitou servico de quarto.", this.nome);
    }
    public void reservarMesaRestaurante() {
        System.out.printf("\nO cliente %s reservou uma mesa no restaurante.", this.nome);
    }
}
