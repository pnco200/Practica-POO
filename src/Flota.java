public class Flota {
    public int capacidadFlota = 15;
    public Micro[] micros = new Micro[capacidadFlota];

    static class Micro {
        private String patente;
        private String destino;
        private String horaSalida;
        private boolean[] asiento;
        public int cantAsientos = 20;
        
        public Micro(String patente, String destino, String horaSalida){
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
    
    public Flota(){
        for (int i = 0; i < capacidadFlota; i++) {
            micros[i] = null;
        }
    }


    public void agregarMicro(Flota.Micro microActual){
        int i = 0;
        while((i < capacidadFlota) && (micros[i] != null)){
            i++;
        }
        if(micros[i] == null){
            micros[i] = microActual;
        }
    }

    public boolean flotaCompleta(){
        return (micros[capacidadFlota] != null);
    }
    
    public boolean eliminarMicro(String patente){
        int i = 0; boolean cumplio = false;
        while((i < capacidadFlota) && !(micros[i].getPatente().equals(patente))){
            i++;
        }
        if((i < capacidadFlota)){
            micros[i] = null;
            cumplio = true;
            for (int j = i; j < capacidadFlota; j++) {
                if (j + 1 < capacidadFlota)
                    micros[j] = micros[j + 1];
            }
        }
        return cumplio;
    }

    public Flota.Micro buscarporPatente(String patente){
        int i=0;
        while ((i<capacidadFlota)&&(!micros[i].getPatente().equals(patente)))
            i++;
        if (i<capacidadFlota)
            return micros[i];
        else
            return null;
    }

    public Flota.Micro buscarporDestino(String destino){
        int i=0;
        while ((i<capacidadFlota)&&(!micros[i].getPatente().equals(destino)))
            i++;
        if (i<capacidadFlota)
            return micros[i];
        else
            return null;
    }
}
