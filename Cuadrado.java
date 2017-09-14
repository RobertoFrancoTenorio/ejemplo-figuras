/**
 * Clase que presenta el cadrado y sus propiedades
 * @author: Roberto Franco Tenorio
 * @version: 13/09/17
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