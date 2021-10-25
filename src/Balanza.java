/*
2- A – Definir una clase para representar balanzas comerciales (para ser utilizadas en
verdulerías, carnicerías, etc). Una balanza comercial sólo mantiene el monto y la cantidad
de items correspondientes a la compra actual (es decir, no almacena los ítems de la
compra). La balanza debe responder a los siguientes mensajes:

▪ iniciarCompra(): inicializa el monto y cantidad de ítems de la compra actual.
▪ registrarProducto(pesoEnKg, precioPorKg): recibe el peso en kg del ítem comprado y
  su precio por kg, debiendo realizar las actualizaciones en el estado de la balanza.
▪ devolverMontoAPagar(): retorna el monto de la compra actual.
▪ devolverResumenDeCompra(): retorna un String del siguiente estilo “Total a pagar X
  por la compra de Y productos” , donde X es el monto e Y es la cantidad de ítems de la
  compra. 
*/
public class Balanza {
    private double monto;
    private int cantidad;
    private String resumen;
    private double montoActual;
    public Balanza(){}

    public void iniciarCompra(){
        monto = 0;
        cantidad = 0;
        resumen = "";
    }
    
    public void registrarProducto(double precioKg, Producto p){
        monto += p.getPesoEnKg()*precioKg;
        montoActual = p.getPesoEnKg() * precioKg;
        cantidad++;
        resumen += p.getDescripcion() + " $" + montoActual + " - " ;
    }

    public double devolverMontoAPagar(){
        return monto;
    }

    public String devolverResumenDeCompra(){
        return "\n" + ">>> " + resumen + "FIN <<<" + "\n" + "\n" + "|Total a pagar: $" + monto + " por " + cantidad + " productos" + "|" + "\n"; 
    }
}
