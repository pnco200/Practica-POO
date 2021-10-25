public class p2_s2_ej1_B_2 {
    public static void main(String[] args) {
        Circulo c = new Circulo(3, "rojo", "amarillo"); //Constructor diseñado
        c.getArea();
        System.out.println(c.getArea());
        
        Circulo e = new Circulo(); //Constructor vacio
        e.setRadio(3);
        System.out.println(e.getArea());
    }
}
