public class Entrenadores {
    private double sueldoBasico;
    private String nombre;
    private int campeonatos;
    private double devsueldo;
    
    public void setSueldo(double sueldoBasico){
        this.sueldoBasico = sueldoBasico;
    }

    public void setCampeonatos(int campeonatos){
        this.campeonatos = campeonatos;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getSueldoBasico(){
        return sueldoBasico;
    }

    public int getCampeonatos(){
        return campeonatos;
    }

    public String getNombre(){
        return nombre;
    }

    public double calcularSueldoAGanar(){
        if(campeonatos >= 1 && campeonatos <= 4){
            devsueldo = sueldoBasico + 5000;
        }
        else if(campeonatos >= 5 && campeonatos <= 10){
            devsueldo = sueldoBasico + 30000;
        }
        else if(campeonatos > 10){
            devsueldo = sueldoBasico + 50000;
        }
        else{
            devsueldo = sueldoBasico;
        }
        return devsueldo;
    }
}
