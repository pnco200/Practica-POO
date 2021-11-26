public class EstudianteGrado extends Estudiante {
  private String carrera;

  public EstudianteGrado(String carrera, int dni, String nombre, int n){
    super(dni, nombre, n);
    this.carrera = carrera;
  }
  public void setCarrera(String carrera) {
    this.carrera = carrera;
  }

  public String getCarrera() {
    return carrera;
  }

  public String toString(){
    return (super.toString() + carrera);
  }
}
