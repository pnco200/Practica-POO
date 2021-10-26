public class Empleado {
    private String nombre;
    private double sueldoBasico;

    public Empleado(String nombre, double sueldoBasico){
        setNombre(nombre);
        setsueldoBasico(sueldoBasico);
    }

    public Empleado(){}

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setsueldoBasico(double sueldoBasico){
        this.sueldoBasico = sueldoBasico;
    }

    public double calcularSueldoACobrar(){
        return sueldoBasico;
    }

    public String getNombre(){
        return nombre;
    }
    public String toString(){
        String aux = "El empleado " + getNombre() + " debe cobrar: ";
        return aux;
    }

}
