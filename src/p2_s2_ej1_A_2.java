public class p2_s2_ej1_A_2 {
    public static void main(String[] args) {
        Triangulo t = new Triangulo(2, 2, 2, "amarillo", "rojo");
        t.setColorRelleno("amarillo");
        t.setLados(2, 2, 3);
        System.out.println(t.calcularArea());
    }
}
