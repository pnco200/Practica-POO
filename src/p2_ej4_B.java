import PaqueteLectura.Lector;

public class p2_ej4_B {
    public static void main(String[] args) {
        Circulo c = new Circulo();
        System.out.println("Ingrese el radio del circulo: "); c.setRadio(Lector.leerDouble());
        System.out.println("El area del circulo es de: " + c.getArea() + " y el perimetro es de: " + c.getPerimetro());
    }
}
