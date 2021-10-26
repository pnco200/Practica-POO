public class p2_s2_ej1_B_2 {
    public static void main(String[] args) {
        Circulo c = new Circulo(); //Constructor diseñado
        c.setRadio(4);
        c.calcularArea();
        System.out.println(c.calcularArea());
        
        Circulo e = new Circulo(); //Constructor vacio
        e.setRadio(3);
        System.out.println(e.calcularArea());
    }
}
