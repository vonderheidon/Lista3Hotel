package br.com.fescfafic.hotel.Model;

public abstract class HospedeIdoso extends Hospede {
    public boolean precisaCadeiraDeRodas;
    public HospedeIdoso(String nome, String cpf, String sexo, int idade, boolean possuiNecessidadesEspeciais, boolean precisaCadeiraDeRodas) {
        super(nome, cpf, sexo, idade, possuiNecessidadesEspeciais);
        this.precisaCadeiraDeRodas = precisaCadeiraDeRodas;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.printf("\nPrecisa de cadeira de rodas: %s", this.precisaCadeiraDeRodas ? "Sim" : "Nao");
    }
}
