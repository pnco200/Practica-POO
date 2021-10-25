public class Micro {
    private String patente;
    private String destino;
    private String horaSalida;
    private boolean[] asiento;
    public int cantAsientos = 20;
    
    Micro(String patente, String destino, String horaSalida){
        this.patente = patente;
        this.destino = destino;
        this.horaSalida = horaSalida;
        asiento = new boolean[cantAsientos];
        for (int i = 0; i < cantAsientos; i++){
            asiento[i] = false;
        }
    }

    //Sets & Gets I.
    public void setPatente(String patente){
        this.patente = patente;
    }
    
    public void setDestino(String destino){
        this.destino = destino;
    }

    public void sethoraSalida(String horaSalida){
        this.horaSalida = horaSalida;
    }

    public String getPatente(){
        return patente;
    }

    public String getDestino(){
        return destino;
    }

    public String getHoraSalida(){
        return horaSalida;
    }

    //Validar asiento
    //IV.
    public boolean validar(int numeroAsiento){
        return (numeroAsiento <= cantAsientos);
    }

    //V.
    public boolean estado(int numeroAsiento){
        return(asiento[numeroAsiento]);
    }

    //Liberar / Ocupar asientos
    //VI.
    public void ocupar(int numeroAsiento){
        if(validar(numeroAsiento)){
            asiento[numeroAsiento] = true;
        }
    }

    //VII.
    public void liberar(int numeroAsiento){
        if(validar(numeroAsiento)){
            asiento[numeroAsiento] = false;
        }
    }

    //II.
    public int cantOcupados(){
        int ocupados = 0;
        for(int i = 0; i < cantAsientos; i++){
            if(asiento[i] == true){
                ocupados++;
            }
        }
        return ocupados;
    }

    //III.
    public boolean estaLleno(){
        return(cantOcupados() == cantAsientos);
    }

    //VIII.
    public int primerAsientoLibre(){
        int i = 0;
        while((i < cantAsientos) && (asiento[i] == true)){
            i++;
        }
        return i;
    }
}
