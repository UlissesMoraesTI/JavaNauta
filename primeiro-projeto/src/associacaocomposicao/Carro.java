package associacaocomposicao;

public class Carro {

    public Motor motor;

    public Carro(Motor motor) {
        this.motor = motor;
    }

    public Carro(int cilindradas) {
        this.motor = new Motor(cilindradas);
    }

    public void mostrarCilindradas() {
        System.out.println("Força em Cilindradas = " + motor.getCilindradas());

    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
