package aula2;

public class Questao1 {

    public static int[][] criaMatriz(int min, int max, int lin, int col) {
        int m[][] = new int[lin][col];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {

                m[i][j] = (int) (Math.random() * (max - min + 1)) + min;

            }
        }
        return m;
    }

    public static void main(String[] args) {
        int m[][] = criaMatriz(10, 109, 7, 6);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {

                System.out.print(m[i][j] + "\t");

            }
            System.out.println("");
        }
    }

}
