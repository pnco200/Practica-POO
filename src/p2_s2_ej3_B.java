public class p2_s2_ej3_B {
    public static void main(String[] args) {
        Libro libro1= new Libro("Alice in wonderland", "Mayonesa", new Libro.Autor("Panico", "rettr"), "n222563s");
        System.out.println(libro1.toString());
        Libro libro2= new Libro("El pepe", "Mayonesa", new Libro.Autor("Rufus", "saease"), "n222563s");
        System.out.println(libro2.toString());
    }
}
