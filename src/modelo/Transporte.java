package modelo;

public  abstract class Transporte {
    protected float carga;
    protected int numeroPassageros;
    protected String modelo;
    protected String cor;
    protected float velociadade;

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    public int getNumeroPassageros() {
        return numeroPassageros;
    }

    public void setNumeroPassageros(int numeroPassageros) {
        this.numeroPassageros = numeroPassageros;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getVelociadade() {
        return velociadade;
    }

    public void setVelociadade(float velociadade) {
        this.velociadade = velociadade;
    }
}
