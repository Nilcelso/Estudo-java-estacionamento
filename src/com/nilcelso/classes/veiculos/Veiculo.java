package com.nilcelso.classes.veiculos;

public class Veiculo {

    private String placa;
    private String marca;
    private String modelo;
    private double fatorEstacionamento;
    private String horaEntrada;
    private String horaSaida;
    private double totalEstacionamento;
    private TipoCarro tipoCarro;

    public Veiculo(String placa){
        this.placa = placa;
    }

    public Veiculo(){
    }

    public TipoCarro getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(TipoCarro tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    public String getPlaca() {
       return this.placa = placa;
    }

    public void setPlaca(String s) {
    }


}
