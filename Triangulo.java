/**
 * Clase que presenta triangulo y sus propiedades
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
    
    }
} 