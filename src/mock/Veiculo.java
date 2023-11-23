package mock;

import modelo.*;

import java.util.ArrayList;
import java.util.List;

public enum Veiculo {
    CARRO(1000.0f, 5, "Sedan", "Prata", 120.0f, new Carro()),
    CAMINHAO(5000.0f, 2, "Caminhão", "Vermelho", 80.0f, new Carro()),
    ONIBUS(8000.0f, 40, "Ônibus", "Azul", 60.0f, new Onibus()),
    VAN(1500.0f, 10, "Van", "Verde", 90.0f, new Onibus()),
    TREM(12000.0f, 300, "Trem", "Cinza", 150.0f, new Trem()),
    AVIAO(50000.0f, 150, "Avião", "Branco", 800.0f, new Aviao()),
    BARCO(8000.0f, 20, "Barco", "Azul", 40.0f, new Barco()),
    BALSA(10000.0f, 50, "Balsa", "Amarelo", 30.0f, new Balsa());

    private final float carga;
    private final int numeroPassageiros;
    private final String modelo;
    private final String cor;
    private final float velocidade;
    private final Transporte transporte;

    Veiculo(float carga, int numeroPassageiros, String modelo, String cor, float velocidade, Transporte transporte) {
        this.carga = carga;
        this.numeroPassageiros = numeroPassageiros;
        this.modelo = modelo;
        this.cor = cor;
        this.velocidade = velocidade;
        this.transporte = transporte;
    }

    public static List<Transporte> buscarTransporte() {
        List<Veiculo> veiculoList = List.of(Veiculo.values());
        List<Transporte> transportes = new ArrayList<>();
        for (Veiculo v : veiculoList) {
            Transporte t = v.transporte;
            t.setCarga(v.carga);
            t.setCor(v.cor);
            t.setModelo(v.modelo);
            t.setNumeroPassageros(v.numeroPassageiros);
            t.setVelociadade(v.velocidade);
            transportes.add(t);
        }
        return transportes;

    }
}
