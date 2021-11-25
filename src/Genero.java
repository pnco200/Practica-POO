public class Genero {
  private Alumno[][] inscripcion; 
  private int cantAlumnos;
  public Genero(int cantAlumnos){
    this.inscripcion = new Alumno[5][cantAlumnos];
    this.cantAlumnos = cantAlumnos;
  }

  public void inscribirAlumno(int Genero, Alumno a){
    int i = 0;
    while((i < cantAlumnos) && inscripcion[Genero][i] != null){
      i++;
    }
    if(inscripcion[Genero][i] == null){
      inscripcion[Genero][i] = a;
    }
  }

  public void asignarPuntaje(double puntaje, String nombre){
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < cantAlumnos; j++) {
        if((inscripcion[i][j] != null) && (inscripcion[i][j].getNombre().equals(nombre))){
          inscripcion[i][j].setPuntaje(puntaje);
        }
      }
    }
  }

  public int getGeneroConcurrido(){
    int maxGenero = -1, alumnosCurrent = 0, maxAlumnos = -1;
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < cantAlumnos; j++) {
        if(inscripcion[i][j] != null)
          alumnosCurrent++;
        if(alumnosCurrent > maxAlumnos){
          maxGenero = i;
          maxAlumnos = alumnosCurrent;
        }
      }
      alumnosCurrent = 0;
    }
    return maxGenero;
  }
  

}
