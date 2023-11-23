package modelo;

public class Aviao extends Aereo{
    @Override
    public float getCarga() {
        return carga;
    }

    @Override
    public void setCarga(float carga) {
        super.setCarga(carga);
    }

    @Override
    public int getNumeroPassageros() {
        return numeroPassageros;
    }

    @Override
    public void setNumeroPassageros(int numeroPassageros) {
        super.setNumeroPassageros(numeroPassageros);
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
        super.setModelo(modelo);
    }

    @Override
    public String getCor() {
        return cor;
    }

    @Override
    public void setCor(String cor) {
        super.setCor(cor);
    }

    @Override
    public float getVelociadade() {
        return velociadade;
    }

    @Override
    public void setVelociadade(float velociadade) {
        super.setVelociadade(velociadade);
    }
}
