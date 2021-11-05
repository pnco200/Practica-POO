public class Estanteria {
  private Libroo[][] estante;
  private int m;
  private int n;

  public Estanteria(int m, int n){
    this.m = m;
    this.n = n;
    this.estante = new Libroo[m][n];
  }

  public int getM() {
    return m;
  }

  public int getN() {
    return n;
  }

  public void almacenarLibro(Libroo l){
    int i = 0, j = 0;
    while((i != m) && (estante[i][j] != null)){
      if(j == n-1){
        j = 0;
        i++;
      }
      else{
        j++;
      }
    }
    if(estante[i][j] == null){
      System.out.println("Posicion: " + i + " " + j);
      estante[i][j] = l;
    }
  }

  public Libroo sacarLibro(int x, int y){
    if(estante[x][y] != null){
      Libroo aux = estante[x][y];
      estante[x][y] = null;
      return aux;
    }
    else{
      return null;
    }
  }

  public int calcular(String aut){
    int cont = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if(estante[i][j].getAutor().equals("aut")){
          cont++;
        }
      }
    }
    return cont;
  }
}
