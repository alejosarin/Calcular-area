package modelo;

public class Rectangulo extends Figura
{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) 
    {
        super();
        this.base = base;
        this.altura = altura;
    }

    public void areaR()
    {
        area = base*altura;
    }
    public void perimetroR()
    {
        perimetro = (2*altura)+(2*base);
    }
       
    public double mostrarArea()
    {
        return this.area;
    }

    public double mostrarPerimetro()
    {
        return this.perimetro;
    }
}
