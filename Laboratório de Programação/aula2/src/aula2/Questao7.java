package aula2;

public class Questao7 {

    public static int menorElemento(int[] v) {
        int menor = 500;
        for (int i = 0; i < v.length; i++) {
            if (menor > v[i]) {
                menor = v[i];
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        int v[] = new int[50];
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * (100 - 1 + 1)) + 1;
        }
        int menor = menorElemento(v);
        System.out.println("O menor valor é: " + menor);
    }

}
