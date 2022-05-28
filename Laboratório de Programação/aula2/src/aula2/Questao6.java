package aula2;

public class Questao6 {

    public static int[][] transposta(int[][] m) {

        int t[][] = new int[m[0].length][m.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {

                t[j][i] = m[i][j];

            }

        }

        return t;
    }

    public static void main(String[] args) {
        int m[][] = Questao1.criaMatriz(1, 100, 7, 7);
        int t[][] = transposta(m);

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {

                System.out.print(t[i][j] + "\t");

            }
            System.out.println("");
        }
    }

}
