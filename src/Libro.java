public class Libro {
    private String titulo;
    private Autor primerAutor; 
    private String editorial;
    private int añoEdicion;
    private String ISBN; 
    private double precio; 
     
    static class Autor{
        private String nombre;
        private String biografia;
        
        public Autor(){}

        public Autor(String nombre, String biografia){
            this.nombre = nombre;
            this.biografia = biografia;
        }
    
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
    
        public void setBiografia(String biografia){
            this.biografia = biografia;
        }
    
        public String getNombre(){
            return nombre;
        }
    
        public String getBiografia(){
            return biografia;
        }
    }

    public Libro(  String unTitulo,  String unaEditorial, int unAñoEdicion,  Autor unPrimerAutor, String unISBN, double unPrecio){
         titulo = unTitulo;
         editorial = unaEditorial; 
         añoEdicion= unAñoEdicion;
         primerAutor = unPrimerAutor;
         ISBN =  unISBN;
         precio = unPrecio;
    }
    


    public Libro(  String unTitulo,  String unaEditorial, Autor unPrimerAutor, String unISBN){
         titulo = unTitulo;
         editorial = unaEditorial; 
         añoEdicion= 2015;
         primerAutor = unPrimerAutor;
         ISBN =  unISBN;
         precio = 100;
    }
    
    public Libro(){
   
    }
    public String getTitulo(){
        return titulo;
    }
  
    public String getEditorial(){
        return editorial;
    }
    public int getAñoEdicion(){
        return añoEdicion;
    }
  
    public Autor getPrimerAutor(){
        return primerAutor;
    } 
    public String getISBN(){
        return ISBN;
    } 
    public double getPrecio(){
        return precio;
    }
   
    public void setTitulo(String unTitulo){
        titulo = unTitulo;
    }
   
    public void setEditorial(String unaEditorial){
         editorial = unaEditorial;
    }
    public void setAñoEdicion(int unAño){
         añoEdicion = unAño;
    }
   
    public void setPrimerAutor(Autor unPrimerAutor){
         primerAutor=unPrimerAutor;
    } 
    public void setISBN(String unISBN){
         ISBN=unISBN;
    } 
    public void setPrecio(double unPrecio){
         precio=unPrecio;
    }
   
    
   @Override
    public String toString(){
        String aux;
        aux= titulo + " por " + primerAutor.getNombre() + " - " + añoEdicion + " - " + " ISBN: " + ISBN;
       return ( aux);
    }
        
}