import PaqueteLectura.Lector;

public class p2_ej3_B {
    public static void main(String[] args) {
        Entrenadores e = new Entrenadores();
        System.out.println("Ingrese el nombre del entrenador: "); e.setNombre(Lector.leerString());
        System.out.println("Ingrese la cantidad de campeonatos ganados por el entrenador: "); e.setCampeonatos(Lector.leerInt());
        System.out.println("Ingrese el suelo basico del entrenador: "); e.setSueldo(Lector.leerDouble());
         
        double sueldo;

        sueldo = e.calcularSueldoAGanar();

        System.out.println("El sueldo a cobrar del entrenador " + e.getNombre() + " es de: " + sueldo);
    }
}
