package br.com.fescfafic.hotel.Model;

public class QuartoSimples extends Quarto{
    public boolean possuiArCondicionado;
    public boolean wifiGratis;
    public boolean possuiChuveiroQuente;
    public int qtdTomadas;
    public String tipoDePiso;
    public Hospede[] listaHospedes;
    public QuartoSimples(int numeroQuarto, double precoPorNoite, boolean disponibilidade, boolean possuiArCondicionado,
                         boolean wifiGratis, boolean possuiChuveiroQuente, int qtdTomadas, String tipoDePiso, int qtdHospedes) {
        super(numeroQuarto, precoPorNoite, disponibilidade);
        super.tipo = "Simples";
        this.possuiArCondicionado = possuiArCondicionado;
        this.wifiGratis = wifiGratis;
        this.possuiChuveiroQuente = possuiChuveiroQuente;
        this.qtdTomadas = qtdTomadas;
        this.tipoDePiso = tipoDePiso;
        this.listaHospedes = new Hospede[qtdHospedes];
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.printf("Possui ar-condicionado: %s\n", this.possuiArCondicionado ? "Sim" : "Nao");
        System.out.printf("Wifi gratis: %s\n", this.wifiGratis ? "Sim" : "Nao");
        System.out.printf("Possui chuveiro quente: %s\n", this.possuiChuveiroQuente ? "Sim" : "Nao");
        System.out.printf("Quantidade de tomadas: %d\n", this.qtdTomadas);
        System.out.printf("Tipo de piso: %s\n", this.tipoDePiso);
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
