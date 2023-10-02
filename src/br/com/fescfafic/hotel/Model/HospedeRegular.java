package br.com.fescfafic.hotel.Model;

public abstract class HospedeRegular extends Hospede {
    public boolean possuiPet;
    public HospedeRegular(String nome, String cpf, String sexo, int idade, boolean possuiNecessidadesEspeciais, boolean possuiPet) {
        super(nome, cpf, sexo, idade, possuiNecessidadesEspeciais);
        this.possuiPet = possuiPet;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.printf("\nPossui pet: %s", this.possuiPet ? "Sim" : "Nao");
    }
    @Override
    public void solicitarServicoDeQuarto() {
        super.solicitarServicoDeQuarto();
    }
    @Override
    public void reservarMesaRestaurante() {
        super.reservarMesaRestaurante();
    }
}
