import PaqueteLectura.*;
public class p2_ej1_B {
    public static void main(String[] args) {
        Triangulo t = new Triangulo();
        System.out.println("Ingrese los lados del triangulo: "); t.setLados(5, 5, 5);
        System.out.print("Ingrese el lado que desa ver: ");System.out.println("El lado elegido vale: " + t.getLados(Lector.leerInt()));
        System.out.println("El area del triangulo vale: " + t.calcularArea());
        System.out.println("El perimetro del triangulo vale: " + t.calcularPerimetro());
    }
}
