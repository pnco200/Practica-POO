import PaqueteLectura.*;
/*
1 – Se dispone de una clase Persona (ya implementada en la carpeta tema2). Un objeto
persona puede crearse sin valores iniciales o enviando en el mensaje de creación el
nombre, DNI y edad (en ese orden). Un objeto persona responde a los siguientes mensajes:
    
    getNombre() retorna el nombre (String) de la persona
    getDNI() retorna el dni (int) de la persona
    getEdad() retorna la edad (int) de la persona
    setNombre(X) modifica el nombre de la persona al “String” pasado por parámetro (X)
    setDNI(X) modifica el DNI de la persona al “int” pasado por parámetro (X)
    setEdad(X) modifica la edad de la persona al “int” pasado por parámetro (X)
    toString() retorna un String que representa al objeto. Ej: “Mi nombre es Mauro, mi DNI es
    11203737 y tengo 70 años”
    
    Realice un programa que cree un objeto persona con datos leídos desde teclado. Luego
    muestre en consola la representación de ese objeto en formato String.
    Piense y responda: ¿Qué datos conforman el estado del objeto persona? ¿Cómo se
    implementan dichos datos? ¿Qué ocurre cuando se le envía un mensaje al objeto?
*/

public class p1_s2_ej1_ej2 {
    public static void main(String[] args) {
        Persona [] vp = new Persona [2];
        //Carga el vector
        for(int i = 0; i < 2; i++){
            Persona p = new Persona();
            System.out.println("Ingrese le nombre de la persona");
            p.setNombre(Lector.leerString());
            System.out.println("Ingrese el DNI de la persona");
            p.setDNI(Lector.leerInt());
            System.out.println("Ingrese la edad de la persona");
            p.setEdad(Lector.leerInt());
            vp[i] = p;
        }
        // Recorre el vector
        int cant65 = 0, minDNI = 999999, posDNI = -1;
        for(int i = 0; i < 2; i++){
            if(vp[i].getEdad() > 65){
                cant65 = cant65 + 1;
            }
            if(vp[i].getDNI() < minDNI){
                minDNI = vp[i].getDNI();
                posDNI = i;
            }
        }
        //Informa
        System.out.println(vp[posDNI].toString());
        System.out.println("La cantidad de personas mayores a 65 años fueron: " + cant65);
    }
}
