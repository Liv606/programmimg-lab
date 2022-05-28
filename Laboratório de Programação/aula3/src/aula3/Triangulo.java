package aula3;

public class Triangulo {

    public double lado1;
    public double lado2;
    public double lado3;

    public Triangulo(double a, double b, double c) {
        this.lado1 = a;
        this.lado2 = b;
        this.lado3 = c;
    }

    public static Triangulo criaTriangulo(double a, double b, double c) {
        Triangulo t = new Triangulo(a, b, c);
        if (t.ehTriangulo()) {
            return t;
        }
        return null;
    }

    public boolean ehTriangulo() {
        if (lado1 > 0 && lado2 > 0 && lado3 > 0 && (lado1 + lado2) > lado3 && (lado1 + lado3) > lado2 && (lado2 + lado3) > lado1) {
            return true;
        }
        return false;
        // ou só: return lado1 > 0 && lado2 > 0 && lado3 > 0 && (lado1 + lado2) > lado3 && (lado1 + lado3) > lado2 && (lado2 + lado3) > lado1;
    }

    public boolean ehEquilatero() {
        if (lado1 == lado2 && lado2 == lado3) {
            return true;
        }
        return false;
        //ou só: return lado1 == lado2 && lado2 == lado3;
        //ou tb: return this.ehTriangulo() && (lado1 == lado2 && lado2 == lado3);
    }

    public boolean ehIsoceles() {
        if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return true;
        }
        return false;
        //ou só: return lado1 == lado2 || lado1 == lado3 || lado2 == lado3;
    }

    public boolean ehEscaleno() {
        if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
            return true;
        }
        return false;
        // ou só: return lado1 != lado2 && lado1 != lado3 && lado2 != lado3;
    }

    public boolean ehRetangulo() {
        if (this.ehEquilatero() == false) {
            if (Math.pow(lado1, 2) == Math.pow(lado2, 2) + Math.pow(lado3, 2)) {
                return true;
            }
            if (Math.pow(lado2, 2) == Math.pow(lado1, 2) + Math.pow(lado3, 2)) {
                return true;
            }
            if (Math.pow(lado3, 2) == Math.pow(lado1, 2) + Math.pow(lado2, 2)) {
                return true;
            }
        }
        return false;
    }

    public double calcularArea() {
        double p = (lado1 + lado2 + lado3) / 2;
        double a = Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
        return a;
    }
    
    public static void main(String[] args) {
        Triangulo t = Triangulo.criaTriangulo(5, 4, 3);
        System.out.println("A área do triângulo é: " + t.calcularArea());
    }

}
