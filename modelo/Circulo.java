package modelo;

public class Circulo extends Figura
{
    private double radio;
    
    public Circulo(double radio)
    {
        super();
        this.radio =radio;
        
        
    }

    public void areaC()
    {
        area=3.1416*(radio*radio);
    }
    public void perimetroC()
    {
        perimetro=2*3.1416*radio;
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
