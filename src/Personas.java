public abstract class Personas {
    private String nombre;
    private int DNI;
    private int edad;

    public Personas(String nombre, int DNI, int edad){
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getDNI() {
        return DNI;
    }
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString(){
        return "Mi nombre es: " + getNombre() + " mi DNI es: " + getDNI() + " y tengo " + getEdad() + " años.";
    }
}
