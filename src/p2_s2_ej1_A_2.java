public class p2_s2_ej1_A_2 {
    public static void main(String[] args) {
        Triangulo t = new Triangulo(2, 2, 2, "amarillo", "rojo");
        System.out.println(t.getColores("relleno")); 

        Triangulo p = new Triangulo();
        p.setColores("amarillo", "rojo");
        p.setLados(2, 2, 3);
        System.out.println(p.getColores("relleno"));
    }
}
