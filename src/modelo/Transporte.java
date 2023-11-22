package modelo;

public  abstract class Transporte {
    private float carga;
    private int numeroPassageros;
    private String modelo;
    private String cor;
    private float velociadade;

    public abstract  float getCarga();

    public abstract void setCarga(float carga);

    public abstract int getNumeroPassageros();

    public abstract void setNumeroPassageros(int numeroPassageros);

    public abstract String getModelo() ;

    public abstract void setModelo(String modelo);

    public abstract String getCor();

    public abstract void setCor(String cor);

    public abstract float getVelociadade() ;

    public abstract void setVelociadade(float velociadade);
}
