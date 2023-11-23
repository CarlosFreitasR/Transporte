package modelo;

public class Onibus extends Terrestre {
    @Override
    public float getCarga() {
        return carga;
    }

    @Override
    public void setCarga(float carga) {
      this.carga = carga;
    }

    @Override
    public int getNumeroPassageros() {
        return numeroPassageros;
    }

    @Override
    public void setNumeroPassageros(int numeroPassageros) {
     this.numeroPassageros = numeroPassageros;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
     this.modelo = modelo;
    }

    @Override
    public String getCor() {
        return cor;
    }

    @Override
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public float getVelociadade() {
        return velociadade;
    }

    @Override
    public void setVelociadade(float velociadade) {
     this.velociadade = velociadade;
    }

    @Override
    public void velocidadeAlcancada() {

    }
}
