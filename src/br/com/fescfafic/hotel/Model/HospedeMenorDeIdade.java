package br.com.fescfafic.hotel.Model;

public abstract class HospedeMenorDeIdade extends Hospede {
    public boolean precisaCadeirinha;
    public HospedeMenorDeIdade(String nome, String cpf, String sexo, int idade, boolean possuiNecessidadesEspeciais, boolean precisaCadeirinha) {
        super(nome, cpf, sexo, idade, possuiNecessidadesEspeciais);
        this.precisaCadeirinha = precisaCadeirinha;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.printf("\nPrecisa cadeirinha: %s", this.precisaCadeirinha ? "Sim" : "Nao");
    }
    @Override
    public void solicitarServicoDeQuarto() {
        System.out.printf("\nCriancas nao podem solicitar servico de quarto.");
    }

    @Override
    public void reservarMesaRestaurante() {
        System.out.printf("\nCriancas nao podem reservar mesas no restaurante.");
    }
}
