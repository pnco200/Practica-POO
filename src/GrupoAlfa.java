public class GrupoAlfa extends Grupo {
  
  public GrupoAlfa(){

  }
  public void aplicarDosisAlfa(double d){
    Paciente[] pacientes = super.getPacientes();
    int i = 1;
    while((i < 11) && (pacientes[i] != null)){
      pacientes[i].aplicarDosis(d);
      i++;
    }
    super.setPacientes(pacientes);
  }
}
