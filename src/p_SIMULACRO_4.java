import PaqueteLectura.Lector;

public class p_SIMULACRO_4 {
  public static void main(String[] args) {
    GrupoAlfa a = new GrupoAlfa();
    GrupoBeta b = new GrupoBeta();
    Paciente p = new Paciente("a", 0.6, 0);

    a.agregarPaciente(p);
    p = new Paciente("b", 0.6, 0);
    a.agregarPaciente(p);
    p = new Paciente("c", 0.6, 0);
    a.agregarPaciente(p);


    p = new Paciente("d", 0.4, 0);
    b.agregarPaciente(p);
    p = new Paciente("e", 2.8, 0);
    b.agregarPaciente(p);
    p = new Paciente("d", 2.9, 0);
    b.agregarPaciente(p);
    p = new Paciente("f", 0.4, 0);
    b.agregarPaciente(p);

    b.aplicarDosisBeta(Lector.leerDouble());
    a.aplicarDosisAlfa(Lector.leerDouble());

    System.out.println(b.toString());
    System.out.println(a.toString());
  }
}
