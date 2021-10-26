public abstract class Empleado {
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

    public abstract double calcularSueldoACobrar();

    public String getNombre(){
        return nombre;
    }

    public double getSueldoBasico(){
        return sueldoBasico;
    }
    
    public String toString(){
        String aux = "El empleado " + getNombre() + " debe cobrar: ";
        return aux;
    }

}
