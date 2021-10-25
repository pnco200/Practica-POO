import PaqueteLectura.*;
public class p1_s2_ej4 {
    public static void main(String[] args) {
    //VAR
        int dias = 5, turnos = 8;
        Persona [][] m = new Persona [dias][turnos];
        Persona a =new Persona();
    //Cargar matriz
        System.out.println("Por favor ingrese el nombre del postulante");
        a.setNombre(Lector.leerString());     
        for (int i = 0; i <= dias-1; i++) {
            for (int j = 0; j <= turnos-1; j++) {
                if(!(a.getNombre().equals("zzz"))){
                    System.out.println("Por favor ingrese el DNI del postulante");
                    a.setDNI(Lector.leerInt());
                    a.setEdad(80);
                    m[i][j] = a;
                    a = new Persona(); 
                    System.out.println("Por favor ingrese el nombre del postulante");
                    a.setNombre(Lector.leerString());  
                }
            }
        }
    //Recorre matriz
        for (int x = 0; x <= dias-1; x++) {
            for (int y = 0; y <= turnos-1; y++) {
                if(m[x][y] != null){
                    System.out.println("En el dia " + x + ", turno " + y + " se debe entrevistar a: " + m[x][y].getNombre());
                }
            }
        }            
    }
}