import PaqueteLectura.*;
/*B - Genere un programa principal que cree una balanza e inicie una compra. Lea
información desde teclado correspondiente a los ítems comprados (peso en kg y precio
por kg) hasta que se ingresa uno con peso 0. Registre cada producto en la balanza. Al
finalizar, informe el resumen de la compra
*/
public class p2_ej2_B {
    public static void main(String[] args) {
        Balanza b = new Balanza();
        b.iniciarCompra();
        Producto p = new Producto();
        double peso;

        System.out.print("Ingrese el peso del producto: "); peso = Lector.leerDouble();
        while(peso != 0){
            p.setPesoEnKg(peso);
            System.out.print("Ingrese una descripcion del producto: "); p.setDescripcion(Lector.leerString());
            System.out.print("Ingrese el valor por kilo del producto: "); b.registrarProducto(Lector.leerDouble(), p);
            System.out.print("Ingrese el peso del producto: "); peso = Lector.leerDouble();
        }
        System.out.println(b.devolverResumenDeCompra());
    }
}
