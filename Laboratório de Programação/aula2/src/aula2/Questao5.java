package aula2;

public class Questao5 {

    public static int[] criaPA(int a0, int r, int n) {

        int v[] = new int[n];
        for (int i = 0; i < v.length; i++) {
            v[i] = a0 + (i * r);
        }
        return v;
    }

    public static void main(String[] args) {
        int v[] = criaPA(1, 2, 5);
        for (int i = 0; i < v.length; i++) {

            System.out.print(v[i] + "\t");

        }
    }

}
