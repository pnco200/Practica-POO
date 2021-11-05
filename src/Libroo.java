public class Libroo {
  private String titulo;
  private String autor;
  private double peso;
  
  public Libroo(String titulo, String autor, double peso){
    this.titulo = titulo;
    this.autor = autor;
    this.peso = peso;
  }

  public String getAutor() {
    return autor;
  }

  public double getPeso() {
    return peso;
  }
  
  public String getTitulo() {
    return titulo;
  }
  
  public void setAutor(String autor) {
    this.autor = autor;
  }
 
  public void setPeso(double peso) {
    this.peso = peso;
  }
 
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
}
