import PaqueteLectura.*;
/*
5- Un edificio de oficinas está conformado por 8 pisos y 4 oficinas por piso. Realice
un programa que permita informar la cantidad de personas que concurrieron a
cada oficina de cada piso. Para esto, simule la llegada de personas al edificio de la
siguiente manera: a cada persona se le pide el nro. de piso y nro. de oficina a la cual
quiere concurrir. La llegada de personas finaliza al indicar un nro. de piso 9. Al
finalizar la llegada de personas, informe lo pedido. 
*/
public class p1_ej5 {
    public static void main(String[] args) {
        
        int pisos = 8, oficinas = 4;
        int [][] m = new int[pisos][oficinas];
        int piso, oficina;
        
        System.out.print("Indique el piso: ");
        piso = Lector.leerInt();
        System.out.print("Indique la oficina: ");
        oficina = Lector.leerInt();
        while(piso != 9){
            m[piso][oficina]++;
            System.out.print("Indique el piso: ");
            piso = Lector.leerInt();
            System.out.print("Indique la oficina: ");
            oficina = Lector.leerInt();
        }
        
        for(int i = 0; i <= pisos-1; i++){
            for (int j = 0; j <= oficinas-1; j++){
                //Chequea que la oficina no este vacia
                if(m[i][j] != 0){
                    System.out.println("En el piso: " + i + " Oficina: " + j + " ingresaron " + m[i][j] + " personas");
                }
            }
        }
    }
    
}