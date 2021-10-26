public class Jugador extends Empleado{
    private int pratidosJugados;
    private int goles;

    public Jugador(String nombre, double sueldoBasico, int pratidosJugados, int goles){
        super(nombre, sueldoBasico);
        this.pratidosJugados = pratidosJugados;
        this.goles = goles;
    }
    
    public int getGoles(){
        return goles;
    }

    public int getPartidosJugados(){
        return pratidosJugados;
    }

    public double calcularSueldoACobrar(){
        if((goles / pratidosJugados) > 0.5)
            return super.getSueldoBasico()*2;
        else
            return super.getSueldoBasico();
    }

    public String toString(){
        return super.toString() + " $" + calcularSueldoACobrar();
    }
}
