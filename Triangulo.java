/**
 * Clase que presenta triangulo y sus propiedades
 * @author: Roberto Franco Tenorio
 * @version: 13/09/17
 */
public class Triangulo extends Figura
{
    private float base;
    private float altura;
    
    public Triangulo(float ingresaBase, float ingresaAltura)
    {
        base=ingresaBase;
        altura=ingresaAltura;
    }
    
    @Override
    public void calcularArea()
    {
        area= (base * altura)/2;
    }
    
    @Override
    public void calcularPerimetro()
    {
        perimetro = base*3;
    }
} 