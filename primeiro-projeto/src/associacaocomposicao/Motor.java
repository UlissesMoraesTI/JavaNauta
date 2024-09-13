package associacaocomposicao;

public class Motor {

    private int cilindradas;

    public Motor() {
    }

    public Motor(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "cilindradas=" + cilindradas +
                '}';
    }
}
