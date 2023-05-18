package ejecutable;
import javax.swing.JOptionPane;

import modelo.Circulo;
import modelo.Rectangulo;

public class Test 
{
    //modelo principal 
    public static void main(String[] args) 
    {
        
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite la figura con la que quiere trabajar :\n1.Rectangulo\n2.Circulo"));
        
        if(x==1)
        {
            double base = Double.parseDouble(JOptionPane.showInputDialog("Base "));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura "));

            Rectangulo miRectangulo = new Rectangulo(base, altura);
            miRectangulo.areaR();
            miRectangulo.perimetroR();
            JOptionPane.showMessageDialog(null,"El area del rectangulo es : "+ miRectangulo.mostrarArea()+" \nEl perimetro del rectangulo es : "+miRectangulo.mostrarPerimetro());


        }
        if (x==2)
        {
            double radio = Double.parseDouble(JOptionPane.showInputDialog("digite el radio del circulo : "));

            Circulo miCirculo = new Circulo(radio);
            miCirculo.areaC();
            miCirculo.perimetroC();
            JOptionPane.showMessageDialog(null,"El area del Circulo es : "+ miCirculo.mostrarArea()+" \nEl perimetro del Circulo es : "+miCirculo.mostrarPerimetro());

        }
        else 
        {
            System.exit(0);
        }
        

       
    }
}