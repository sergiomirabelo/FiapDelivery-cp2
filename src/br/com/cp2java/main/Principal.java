package br.com.cp2java.main;

import br.com.cp2java.model.Veiculo;
import br.com.cp2java.model.Caminhao;
import br.com.cp2java.model.Moto;
import br.com.cp2java.model.Rota;
import br.com.cp2java.model.Pacote;

public class Principal {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao("ABC1234", 5000.0, 4);
        Pacote pacote = new Pacote("BR999", 10.5, "Pendente");

        Rota rota = new Rota(pacote, caminhao);
        rota.iniciarEntrega();

        Moto moto = new Moto("XYZ9876", 30.0, true);
        Rota rotaMoto = new Rota(pacote, moto);
        rotaMoto.iniciarEntrega();
    }
}