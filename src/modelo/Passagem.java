package modelo;

import mock.Veiculo;

import java.util.List;

public class Passagem {
    private float valorPassagem;
    private Cidade origem;
    private Cidade destino;
    private Transporte transporte;
    private double km;
    private double tempoViagem;

    public Passagem(Cidade origem, Cidade destino) {
        this.origem = origem;
        this.destino = destino;
        calcularDistancia();
        calcualarPreco();
    }

    private void calcualarPreco() {
        valorPassagem = (float) Math.random();
    }

    private void calcularVelocidade() {
        this.tempoViagem = km / transporte.getVelociadade();
    }

    private void calcularDistancia() {
        // Raio da Terra em quilômetros
        final double raioTerra = 6371.0;

        // Converter graus para radianos
        origem.setLatitude(Math.toRadians(origem.getLatitude()));
        origem.setLongitude(Math.toRadians(origem.getLongitude()));
        destino.setLatitude(Math.toRadians(origem.getLatitude()));
        destino.setLongitude(Math.toRadians(origem.getLongitude()));

        // Diferenças de coordenadas
        double distanciaLatitude = destino.getLatitude() - origem.getLatitude();
        double distanciaLongitude = destino.getLongitude() - origem.getLongitude();

        // Fórmula de Haversine
        double a = Math.sin(distanciaLatitude / 2) * Math.sin(distanciaLatitude / 2) +
                Math.cos(origem.getLatitude()) * Math.cos(destino.getLatitude()) *
                        Math.sin(distanciaLongitude / 2) * Math.sin(distanciaLongitude / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        // Distância em quilômetros
        this.km = raioTerra * c;
    }

    public void tabelaPassagem() {
        System.out.printf("Origem: %s - Destino: %s\n", origem.getCidade(), destino.getCidade());
        System.out.println("=====================================================================================");
        System.out.println("||  Veiculo  ||  Distancia  ||  Tempo Viagem  ||  Valor Passagem  ||");
        System.out.println("||_________________________________________________________________________________||");
        List<Transporte> transporteList = Veiculo.buscarTransporte();
        for (Transporte v : transporteList) {
            this.transporte = v;
            calcularVelocidade();
            System.out.printf("||   %s   ||   %.2f   ||   %.2f   ||   %.2f   ||\n",
                    v.getModelo(), km, tempoViagem, valorPassagem);
        }
    }


}

