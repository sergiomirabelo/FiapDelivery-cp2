package br.com.cp2java.model;

public class Caminhao extends Veiculo {
    private int numeroDeEixos;

    public Caminhao(String placa, double capacidadeKg, int numeroDeEixos) {
        super(placa, capacidadeKg);
        this.numeroDeEixos = numeroDeEixos;
    }

    public int getNumeroDeEixos() { return numeroDeEixos; }
}