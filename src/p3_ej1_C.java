public class p3_ej1_C {
    public static void main(String[] args) {
        Triangulo t = new Triangulo(5, 5, 5, "amarillo", "Rojo");
        Circulo c = new Circulo();
        c.setRadio(5); c.setColorLinea("amarillo"); c.setColorRelleno("rojo");
        Cuadrado x = new Cuadrado(5, "amarillo", "rojo");

        System.out.println("Triangulo: " + t.toString() + " -- Circulo: " + c.toString() + " -- Cuadrado: " + x.toString());
    } 
}
