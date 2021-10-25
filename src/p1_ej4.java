import PaqueteLectura.*;
public class p1_ej4{
    
    public static void main(String[] args) {
        int dimf = 10, dimc = 10;
        int [][] matriz = new int[dimf][dimc];
        
        //Genera la matriz
        for(int i = 0; i <= dimf-1; i++){
            for (int j = 0; j <= dimc-1; j++) {
                matriz[i][j] = GeneradorAleatorio.generarInt(200);
            }
        }     
        int cont = 0, suma = 0;
        int [] v = new int[10];
        System.out.print("Ingrese el numero que desea buscar en la matriz: ");
        int x = Lector.leerInt();
        String pos = "0";
        boolean encontro = false;
        
        //Busca en la matriz
        for(int i = 0; i <= dimf-1; i++){
            for (int j = 0; j <= dimc-1; j++) {
                System.out.print(matriz[i][j] + " - ");
                if ((i >= 2) && (i <= 9)){
                    suma = suma + matriz[i][j];
                }
                else if((j >= 0) && (j <=3)){
                    suma = suma + matriz[i][j];
                }
                v[j] = v[j] + matriz[i][j];
                
                if (matriz[i][j] == x){
                    encontro = true;
                    pos = "[" + i + " , " + j + "]";
                }
                cont++;
            }
        }

        //Informa
        System.out.println();
        System.out.println("La cantidad de elementos son: " + cont);
        System.out.println("La suma segun las condiciones da: " + suma);
        if(encontro)
            System.out.println("El elemento solicitado estaba en la matriz en la posicion: " + pos);
        else
            System.out.println("El elemento no se encuentra en la matriz");
        for (int i = 0; i < v.length; i++) {
            System.out.print(" - " + v[i]);
        }
    }
}
