public class Trabajador extends Personas {
    private String tarea;

    public Trabajador(String nombre, int DNI, int edad, String tarea){
        super(nombre, DNI, edad);
        this.tarea = tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }
    
    public String toString(){
        return super.toString() + " Soy " + tarea;
    }
}
