public class Grupo {
  private Paciente[] pacientes;

  public Grupo(){
    this.pacientes = new Paciente[11];
  }
  
  public Paciente[] getPacientes() {
    return pacientes;
  }
  
  public void setPacientes(Paciente[] pacientes) {
    this.pacientes = pacientes;
  }
  
  public int agregarPaciente(Paciente p){
    int i = 1;
    while((i < 11) && (pacientes[i] != null)){
      i++;
    }
    pacientes[i] = p;
    return i;
  }

  public Paciente devolverPaciente(int id){
    int i = 1;
    while((i < 11) && (i != id)){
      i++;
    }
    return pacientes[i];
  }

  public String toString(){
    int i = 1; String aux = "";
    while((i < 11) && (pacientes[i] != null)){
      aux = aux + "ID: " + i + " nombre: " + pacientes[i].getNombre() + " ultima glucosa: " + pacientes[i].getResultado() + " ultima dosis: " + pacientes[i].getDosis();
      i++;
    }
    return aux;
  }

}
