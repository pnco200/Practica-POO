import PaqueteLectura.Lector;

public class p1_ej6 {
    public static void main(String[] args) {
        int dim = 5;        
        int [] v = new int[dim];
        int maxop = -1, op;
        
        System.out.print("Que operacion desea realizar? (0--4): "); op = Lector.leerInt();
        while(op != 5){
            v[op] = v[op] + 1;
            System.out.print("Que operacion desea realizar? (0--4): "); op = Lector.leerInt();
        }
        for(int i = 0; i < dim; i++){
            if(v[i] > maxop){
                maxop = i;
            }
        }
        System.out.println("La operacion mas utilizada fue: " + maxop);
    }
}
