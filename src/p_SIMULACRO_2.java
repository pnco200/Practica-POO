import PaqueteLectura.*;
public class p_SIMULACRO_2 {
  
  public static void main(String[] args) {
    Genero c = new Genero(20);
    String nombre, instrumento;
    int edad;
    double puntaje;
    for (int i = 0; i < 5; i++) {
      nombre = GeneradorAleatorio.generarString(8);
      instrumento = GeneradorAleatorio.generarString(10);
      edad = GeneradorAleatorio.generarInt(13);
      puntaje = GeneradorAleatorio.generarDouble(10);
      Alumno a = new Alumno(nombre, edad, instrumento);
      a.setPuntaje(puntaje);
      c.asignarPuntaje(a.getPuntaje(), a.getNombre());
      c.inscribirAlumno(GeneradorAleatorio.generarInt(5), a);
    }

    System.out.println("Genero mas concurrido: " + c.getGeneroConcurrido());

  }
  
}