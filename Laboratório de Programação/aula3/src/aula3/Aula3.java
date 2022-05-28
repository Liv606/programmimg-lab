package aula3;

public class Aula3 {

    public static void main(String[] args) {
        
        Triangulo t = Triangulo.criaTriangulo(5, 4, 3);
        System.out.println(t.lado1);
        System.out.println(t.lado2);
        System.out.println(t.lado3);
        System.out.println(t.ehEquilatero());
        System.out.println(t.ehEscaleno());
        System.out.println(t.ehIsoceles());
        System.out.println(t.ehRetangulo());
        System.out.println(t.ehTriangulo());
        System.out.println(t.calcularArea());
        
    }
    
}
