public class Triangulo{
    
    private double lado1;
    private double lado2;
    private double lado3;
    private String colorRelleno;
    private String colorLinea;
    private double devlado;
    private String devcolor;
    
    public Triangulo(){
        
    }
    
    public Triangulo(double unLado1, double unLado2, double unLado3, String unColorRelleno, String unColorLinea){
        lado1 = unLado1;
        lado2 = unLado2;
        lado3 = unLado3;
        colorRelleno = unColorRelleno;
        colorLinea = unColorLinea;
    }

    public void setLados(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }


    public void setColores(String colorRelleno, String colorLinea){
        this.colorRelleno = colorRelleno;
        this.colorLinea = colorLinea;
    }

    public double getLados(int unLado){
        if(unLado == 1)
            devlado = lado1;
        else if(unLado == 2)
            devlado = lado2;
        else if(unLado == 3)
            devlado = lado3;
        return devlado;
    }  
    
    public double getArea(){
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
    }

    public double getPerimetro(){
        return lado1 + lado2 + lado3;
    }
    
    public String getColores(String unColor){
        if(unColor.equals("relleno"))
            devcolor = colorRelleno;
        if(unColor.equals("linea"))
            devcolor = colorLinea;
        return devcolor;
    }
}
