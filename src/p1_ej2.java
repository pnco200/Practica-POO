//Saca el factorial de los numeros impares en el rango de 1..9
public class p1_ej2{
    public static void main(String[] args){
        for(int i = 1; i < 10; i = i+2){
            int factorial = 1;
            int x = i;
            while (x != 0){
                factorial = factorial * x;
                x--;
            }
            System.out.println(factorial);
        }
    }
}

