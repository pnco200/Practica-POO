
public class PANICO{
  public static void main(String[] args) {
    Hotel h = new Hotel(2, 2);
    Cliente c1 = new Cliente("Nicolas", 43988811); //Pide que ingrese clientes, asique ingreso 2
    Cliente c2 = new Cliente("Juan", 1689564);

    h.ingresarCliente(c1, 0);
    h.ingresarCliente(c2, 1);
    System.out.println(h.liberarPiso(0));
    System.out.println(h.liberarPiso(1));

  }
}
