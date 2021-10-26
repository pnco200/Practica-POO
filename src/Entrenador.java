public class Entrenador extends Empleado {
    private int cantCampeonatos;

    public Entrenador(String nombre, double sueldoBasico, int cantCampeonatos){
        super(nombre, sueldoBasico);
        this.cantCampeonatos = cantCampeonatos;
    }

    public int getCampeonatos(){
        return cantCampeonatos;
    }

    public double calcularSueldoACobrar(){
        if(cantCampeonatos >= 1 && cantCampeonatos <= 4)
            return super.calcularSueldoACobrar() + 50000;
        else if(cantCampeonatos >= 5 && cantCampeonatos <= 10)
            return super.calcularSueldoACobrar() + 30000;
        else if(cantCampeonatos > 10)
            return super.calcularSueldoACobrar() + 50000;
        else
            return 0;
    }

    public String toString(){
        return super.toString() + " $" + calcularSueldoACobrar();
    }
}
