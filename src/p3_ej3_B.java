public class p3_ej3_B {
    public static void main(String[] args) {
        Trabajador t = new Trabajador("Juan jose", 43988811, 27, "Ingeniero Termonuclear");
        Civil c = new Civil("El Pepe", 25639814, 87);

        System.out.println(c.toString());
        System.out.println(t.toString());
    }
}
