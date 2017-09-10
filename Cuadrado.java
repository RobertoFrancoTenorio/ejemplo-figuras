/**
 * Esta clase representa en cuadrado y sus propiedades
 */
public class Cuadrado extends Figura
{
    private float lado;
    
    public Cuadrado(float ingresaLado)
    {
        lado=ingresaLado;
    }
    
    @Override
    public void calcularArea()
    {
        area=lado*lado;
    }
    
    @Override
    public void calcularPerimetro()
    {
        perimetro=lado*4;
    }
}