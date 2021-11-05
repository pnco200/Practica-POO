import PaqueteLectura.*;
public class Parcial_ej2 {
  public static void main(String[] args) {
    Estanteria e = new Estanteria(5, 3);
    String autor, titulo; double peso;
    for (int i = 0; i < 7; i++) {
      System.out.println("Por favor ingrese el nombre del autor: "); autor = GeneradorAleatorio.generarString(10);
      System.out.println("Por favor ingrese el tiutlo del libro"); titulo = GeneradorAleatorio.generarString(5);
      System.out.println("Por favor ingrese el peso del libro: "); peso = GeneradorAleatorio.generarDouble(6);
      Libroo l = new Libroo(titulo, autor, peso);
      e.almacenarLibro(l);
    }
    Libroo u = e.sacarLibro(1, 2);
    System.out.println("Autor: " + u.getAutor() + " Titulo: " + u.getTitulo() + " Peso: " + u.getPeso());
  }
}
