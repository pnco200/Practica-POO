public class Alumno {
    private String nombre;
    private int edad;
    private String instrumento;
    private double puntaje;
    
    public Alumno(String nombre, int edad, String instrumento){
        this.edad = edad;
        this.instrumento = instrumento;
        this.nombre = nombre;
        puntaje = -1;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public void setPuntaje(double puntaje) {
      this.puntaje = puntaje;
    }

    public int getEdad() {
      return edad;
    }

    public String getInstrumento() {
      return instrumento;
    }

    public String getNombre() {
      return nombre;
    }
    
    public double getPuntaje() {
      return puntaje;
    }
    
    
}
