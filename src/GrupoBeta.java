public class GrupoBeta extends Grupo {
  
  public void aplicarDosisBeta(double d){
    Paciente[] pacientes = super.getPacientes();
    int i = 1;
    while((i < 11) && (pacientes[i] != null)){
      if(pacientes[i].getResultado() > 2.5){
        pacientes[i].aplicarDosis(d);
      }
      i++;
    }
    super.setPacientes(pacientes);
  }
}
