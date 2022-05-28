package labaula4;

public class CarroEsportivo extends Veiculo {

    private String aerofole;
    private boolean turboOn;

    public CarroEsportivo() {
        aerofole = "Sim";
        turboOn = false;
    }

    @Override
    public void andar() {
        if (turboOn) {
            System.out.println("VRUMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
        } else {
            System.out.println("Vruummmmm");
        }
    }

    public void ligarTurbo() {
        turboOn = true;
    }

    public void desligarTurbo() {
        turboOn = false;
    }
}
