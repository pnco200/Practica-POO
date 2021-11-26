public class p_SIMULACRO_3 {
  public static void main(String[] args) {
    String carrera = "Informatica", nombre = "Nicolas";
    int dni = 43988, n = 3;
    EstudianteGrado g = new EstudianteGrado(carrera, dni, nombre, n);
    nombre = "Matematica"; int nota = 5; String fecha = "10/12/2021";
    Materia m = new Materia(nombre, nota, fecha);
    g.agregarMateria(m);
    nombre = "tesis"; nota = 7; fecha = "89/33";
    Materia r = new Materia(nombre, nota, fecha);
    g.agregarMateria(r);
    nombre = "Marcos";
    dni = 9996; n = 1; String titulo = "FisicoCuanticoo", universidad = "UNLP"; 
    EstudianteDoctorado d = new EstudianteDoctorado(titulo, universidad, nombre, dni, n);
    nombre = "tesis"; nota = 8; fecha = "10/12/2021";
    Materia l = new Materia(nombre, nota, fecha);
    d.agregarMateria(l);
    System.out.println(g.toString());
    System.out.println(d.toString());
  }
}
