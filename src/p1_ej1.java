import PaqueteLectura.Lector; 

public class p1_ej1{

    public static void main(String[] args){
        int x = Lector.leerInt();
        int factorial = 1;
        while (x != 0){
            factorial = factorial * x;
            x--;
        }
        System.out.println(factorial);
    }
}
