package br.com.cp2java.model;

public class Pacote {
    private String codigo;
    private double pesoKg;
    private String status;

    public Pacote(String codigo, double pesoKg, String status) {
        this.codigo = codigo;
        this.pesoKg = pesoKg;
        this.status = status;
    }

    public String getCodigo() { return codigo; }
    public double getPesoKg() { return pesoKg; }
    public String getStatus() { return status; }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }
}