import PaqueteLectura.Lector;

public class p2_s2_ej4_B {
    public static void main(String[] args){
        Micro m = new Micro("ABC123", "Mar del Plata", "05:00");

        int completadas = 0;
        int numeroAsiento = -2;
        System.out.println("Por favor, ingrese el numero de asiento que desea: "); numeroAsiento = Lector.leerInt();
        while((completadas < m.cantAsientos) && (numeroAsiento != -1)){
            while(!(m.validar(numeroAsiento))){
                System.out.println("ERROR! Eliga un asiento entre el 0 y el " + (m.cantAsientos-1));
                numeroAsiento = Lector.leerInt();
            }
            if (!(m.estado(numeroAsiento))){
                m.ocupar(numeroAsiento);
                System.out.println("La operacion concluyo exitosamente");
                completadas++;
            }
            else{
                System.out.println("El asiento elegido esta ocupado, el primer asiento libre es el: " + m.primerAsientoLibre());
            }
            System.out.println("Por favor, ingrese el numero de asiento que desea: "); numeroAsiento = Lector.leerInt();
        }
        System.out.println("La cantidad de asientos ocupados son: " + m.cantOcupados());


    }
}
