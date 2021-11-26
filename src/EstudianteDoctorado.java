public class EstudianteDoctorado extends Estudiante {
  private String titulo;
  private String universidad;

  public EstudianteDoctorado(String titulo, String universidad, String nombre, int dni, int n){
    super(dni, nombre, n);
    this.titulo = titulo;
    this. universidad = universidad;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setUniversidad(String universidad) {
    this.universidad = universidad;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getUniversidad() {
    return universidad;
  }

  public String toString(){
    return (super.toString() + titulo + " " + universidad);
  }
}
