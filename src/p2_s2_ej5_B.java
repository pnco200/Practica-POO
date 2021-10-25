import PaqueteLectura.Lector;

public class p2_s2_ej5_B {
    public static void main(String[] args) {
        Flota f = new Flota();
        String patente, destino, horaSalida; int completado = 0;      
        
        System.out.println("Por favor ingrese la patente del micro: "); patente =Lector.leerString(); 
        while(!(patente.equals("ZZZ000")) && (completado < f.capacidadFlota)){  
            System.out.println("Por favor ingrese el destino del micro: "); destino = Lector.leerString();
            System.out.println("Ingrese la hora de salida del micro: "); horaSalida = Lector.leerString();
            
            Flota.Micro x = new Flota.Micro(patente, destino, horaSalida);
            f.agregarMicro(x);
            completado ++;
            
            System.out.println("Por favor ingrese la patente del micro: "); patente =Lector.leerString(); 
        }

        System.out.println("Por favor ingrese la patente del micro que desea eliminar: "); patente = Lector.leerString();
        
        
        if(f.eliminarMicro(patente)){
            System.out.println("El micro ha sido eliminado exitosamente de la flota");
        }
        else{
            System.out.println("No se ha podido eliminar el micro de la flota");
        }

        
      
      
        System.out.println("Ingresa patente que queres buscar"); patente = Lector.leerString();
        if(f.buscarporPatente(patente) == null){
            System.out.println("Se ha comprobado que el micro no esta en la flota");
        }
        else{
            System.out.println("Se ha comprobado que el micro esta en la flota");
        }

        System.out.println("Por favor ingrese el destino del micro que desea conocer: "); destino = Lector.leerString();

        if(f.buscarporDestino(destino) != null){
            System.out.println("La patente del micro cuyo destino es " + destino + "es: " + f.buscarporDestino(destino).getPatente());
        }
        else{
            System.out.println("No se ha encontrado el micro");
        }

    }
}
