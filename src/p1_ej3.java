import PaqueteLectura.GeneradorAleatorio;

/*
Escriba un programa que lea las alturas de los 15 jugadores de un equipo de
básquet y las almacene en un vector. Luego informe:
- la altura promedio
- la cantidad de jugadores con altura por encima del promedio
*/

public class p1_ej3{
    public static void main(String[] args){
        int [] vector = new int[15];
        double altprom = 0;
        for (int i=0; i<15; i++) {
            vector[i] = GeneradorAleatorio.generarInt(190);
            altprom = altprom + vector[i];
            System.out.println(vector[i]);
        }
        altprom = altprom / 15;
        System.out.println(altprom);
        int cantsup = 0;
        for (int i=0; i<15; i++) {
            if (vector[i] > altprom){
                cantsup++;
            }
        }
        System.out.println(cantsup);
    }
}
