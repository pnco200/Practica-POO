public class Triangulo extends Figura{
    
    private double lado1;
    private double lado2;
    private double lado3;
    private double devlado;
    
    public Triangulo(){
        super();
    }
    
    public Triangulo(double unLado1, double unLado2, double unLado3, String unColorRelleno, String unColorLinea){
        super(unColorRelleno, unColorLinea);
        lado1 = unLado1;
        lado2 = unLado2;
        lado3 = unLado3;
    }

    public void setLados(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
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
    
    public double calcularArea(){
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
    }

    public double calcularPerimetro(){
        return lado1 + lado2 + lado3;
    }
    
    public String toString(){
        return super.toString() + "Lados: " + lado1 +" "+ lado2 +" " + lado3;
    }
}
