public class Circulo {
    private double radio;
    private String colorRelleno;
    private String colorLinea;

    public Circulo(){}

    public Circulo(double radio, String colorRelleno, String colorLinea){
        this.radio = radio;
        this.colorRelleno = colorRelleno;
        this.colorLinea = colorLinea;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }
    public void setColorRelleno(String colorRelleno){
        this.colorRelleno = colorRelleno;
    }
    
    public void setColorLinea(String colorLinea){
        this.colorLinea = colorLinea;
    }

    public double getRadio(){
        return radio;
    }
    public String getRelleno(){
        return colorRelleno;
    }
    public String getContorno(){
        return colorLinea;
    }

    public double getArea(){
        return Math.PI * (Math.pow(radio, 2));
    }
    
    public double getPerimetro(){
        return 2 * Math.PI * radio;
    }
}
