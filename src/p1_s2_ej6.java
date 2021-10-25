import PaqueteLectura.Lector;

public class p1_s2_ej6 {
    public static void main(String[] args) {
        //Var
        int DIMF = 3;
        Partido v[] = new Partido [DIMF];
        int i = 0;
        Partido p = new Partido();
        //Carga Vector
        System.out.print("Ingrese el nombre del equipo visitante: "); p.setVisitante(Lector.leerString());
        while((!(p.getVisitante().equals("zzz"))) && (i < DIMF)){
            System.out.print("Ingrese el nombre del quipo local: "); p.setLocal(Lector.leerString());
            System.out.print("Ingrese los goles realizados por el local: "); p.setGolesLocal(Lector.leerInt());
            System.out.print("Inghrese los goles realizados por el visitante: "); p.setGolesVisitante(Lector.leerInt());
            v[i] = p;
            p = new Partido();
            System.out.print("Ingrese el nombre del equipo visitante: "); p.setVisitante(Lector.leerString());
            i++;
        }
        int ganadosriber = 0, golesboka = 0, cantempate = 0;
        //Recorre el Vector
        for(int j = 0; j < i; j++){
            if(v[j].getGanador().equals("river")){
                ganadosriber++;
            }
            if(v[j].getLocal().equals("boca")){
                golesboka = golesboka + v[j].getGolesLocal();
            }
            else if(v[j].getVisitante().equals("boca")){
                golesboka = golesboka + v[j].getGolesVisitante();
            }
            if(v[j].hayEmpate()){
                cantempate++;
            }
        }
        //Informa
        System.out.println(">>>Los partidos ganados por riber fueron: " + ganadosriber);
        System.out.println(">>>La cantidad de goles metidos por bokita fueron: " + golesboka);
        System.out.println(">>>El promedio de partidos empatados fue de: " + (double)cantempate*100/i + "%");
    }
}
