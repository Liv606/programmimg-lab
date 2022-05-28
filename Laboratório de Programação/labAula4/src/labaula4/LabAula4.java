package labaula4;

public class LabAula4 {

    public static void main(String[] args) {

        Veiculo v1 = new Veiculo();
        Veiculo v2 = new CarroEsportivo();
        CarroEsportivo c1 = new CarroEsportivo();
        v2.setPlaca("XYZ");
        v1.andar();
        c1.andar();
        v2.andar();

    }

}
