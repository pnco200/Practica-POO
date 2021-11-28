

public class Habitacion{
  private double costoPorDia;
  private boolean estaOcupada;
  private Cliente datosCli;


  public Habitacion(double costoPorDia, boolean estaOcupada){
    this.costoPorDia = costoPorDia;
    this.estaOcupada = estaOcupada;
  }

  public void setCostoPorDia(double costoPorDia) {
    this.costoPorDia = costoPorDia;
  }

  public void setDatosCli(Cliente datosCli) {
    this.datosCli = datosCli;
  }

  public void setEstaOcupada(boolean estaOcupada) {
    this.estaOcupada = estaOcupada;
  }

  public double getCostoPorDia() {
    return costoPorDia;
  }
  public Cliente getDatosCli() {
    return datosCli;
  }

  public boolean getEstaOcupada(){
    return estaOcupada;
  }
}
