public class p3_ej2_E {
    public static void main(String[] args) {
        Jugador j = new Jugador("Nicolas Panico", 3000, 20, 2);
        Entrenador e = new Entrenador("Miguel Fierro", 3000, 15);

        System.out.println(j.toString());
        System.out.println(e.toString());
    }
}
