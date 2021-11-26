import PaqueteLectura.GeneradorAleatorio;

public class Paciente {
  private String nombre;
  private double resultado;
  private double dosis;

  public Paciente(String nombre, double resultado, double dosis){
    this.dosis = dosis;
    this.nombre = nombre;
    this.resultado = resultado;
  }
  public double getDosis() {
    return dosis;
  }
  public String getNombre() {
    return nombre;
  }
  public double getResultado() {
    return resultado;
  }
  public void setDosis(double dosis) {
    this.dosis = dosis;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public void setResultado(double resultado) {
    this.resultado = resultado;
  }

  public void aplicarDosis(double d){
    dosis = d;
    resultado = resultado - GeneradorAleatorio.generarDouble(1);
  }
}
