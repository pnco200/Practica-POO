/*
5- Realice un programa que cargue un vector con 10 strings leídos desde teclado. El vector
generado tiene un mensaje escondido que se forma a partir de la primera letra de cada
string. Muestre el mensaje escondido en consola.
NOTA: La primera letra de un string se obtiene enviándole el mensaje charAt(0) al objeto
string. Probar con: humo oso lejos ala menos usado nene de ocho ! Debería imprimir:
holamundo!

*/
import PaqueteLectura.*;
public class p1_s2_ej5 {
    public static void main(String[] args) {
        String v [] = new String [10];
        for(int i = 0; i < 10; i++){
            System.out.print("Ingrese una palabra: "); v[i] = Lector.leerString();
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(v[i].charAt(0));
        }
    }
}
