

public class Hotel{
  private Habitacion[][] habitaciones;
  private int pisos;
  private int cuartos;
  
  public Hotel(int pisos, int cuartos){
    this.habitaciones = new Habitacion[pisos][cuartos];
    this.pisos = pisos;
    this.cuartos = cuartos;
    for (int i = 0; i < pisos; i++) {
      for (int j = 0; j < cuartos; j++) {
        Habitacion ha = new Habitacion((800 + (100*i)), false);
        habitaciones[i][j] = ha;
      }
    }
  }

  public int ingresarCliente(Cliente c, int numeroHabitacion){
    boolean ingreso = false; int pisoIngresada = -1;
    for (int i = 0; i < pisos; i++) {
      for (int j = 0; j < cuartos; j++) {
        if((habitaciones[i][j] == habitaciones[i][numeroHabitacion]) && (habitaciones[i][j].getEstaOcupada() == false) && (ingreso == false)){
          habitaciones[i][j].setDatosCli(c);
          ingreso = true;
          habitaciones[i][j].setEstaOcupada(true);
          pisoIngresada = i;
        }
      }
      
    }
    return pisoIngresada;
  }

  public String liberarPiso(int numeroPiso){
    String aux = "";
    for (int i = 0; i < cuartos; i++) {
      if(habitaciones[numeroPiso][i].getEstaOcupada() == true){
        aux = aux + " " + habitaciones[numeroPiso][i].getDatosCli().getNombre();
      }
    }
    return aux;
  }
}
