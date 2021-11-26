public class Estudiante {
  private int dni;
  private String nombre;
  private Materia[] materiasAprobadas;
  private int n;

  public Estudiante(int dni, String nombre, int n){
    this.dni = dni;
    this.nombre = nombre;
    this.materiasAprobadas = new Materia[n];
    this.n = n;
  }

  public int getDni() {
    return dni;
  }

  public String getNombre() {
    return nombre;
  }

  public void setDni(int dni) {
    this.dni = dni;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void agregarMateria(Materia m){
    int i = 0;
    while((i < n) && (materiasAprobadas[i] != null)){
      i++;
    }
    if(i < n){
      materiasAprobadas[i] = m;
    }
  }

  public boolean estaGraduado(){
    int i = 0; boolean aproboTesis = false;
    while((i < n) && (materiasAprobadas[i] != null)){
      if(materiasAprobadas[i].getNombre().equals("tesis")){
        aproboTesis = true;
      }
      i++;
    }
    if((i == n) && (aproboTesis)){
      return true;
    }
    else
      return false;
  }

  public String toString(){
    int i = 0;
    String aux = "";
    while((i < n) && (materiasAprobadas[i] != null)){
      aux = aux + materiasAprobadas[i].getNombre() + " nota: " + materiasAprobadas[i].getNota() + " fecha: " + materiasAprobadas[i].getFecha() + "-";
      i++; 
    }
 
    return (dni + " " + nombre + " " + aux + " " + estaGraduado() + " ");
  }
}
