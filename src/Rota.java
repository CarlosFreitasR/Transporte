import java.util.List;

public class Rota {
    private List<Passagem> passagems;
    private boolean idaVolta;
    private float valorTotalViagem;
    private long tempoTotalViagem;
    private int numeroTrocasTransporte;

    public List<Passagem> getPassagems() {
        return passagems;
    }

    public void setPassagems(List<Passagem> passagems) {
        this.passagems = passagems;
    }

    public boolean isIdaVolta() {
        return idaVolta;
    }

    public void setIdaVolta(boolean idaVolta) {
        this.idaVolta = idaVolta;
    }

    public float getValorTotalViagem() {
        return valorTotalViagem;
    }

    public void setValorTotalViagem(float valorTotalViagem) {
        this.valorTotalViagem = valorTotalViagem;
    }

    public long getTempoTotalViagem() {
        return tempoTotalViagem;
    }

    public void setTempoTotalViagem(long tempoTotalViagem) {
        this.tempoTotalViagem = tempoTotalViagem;
    }

    public int getNumeroTrocasTransporte() {
        return numeroTrocasTransporte;
    }

    public void setNumeroTrocasTransporte(int numeroTrocasTransporte) {
        this.numeroTrocasTransporte = numeroTrocasTransporte;
    }
}
