/**
 * Esta clase es un super clase para representar las
 * caracteristicas comunes de muchas figuras
 * 
 * @Autor: Roberto Franco
 * @version 1.0
 */
abstract public class Figura
{
    protected float area;
    protected float perimetro;
    
    /**
     * Constructor de la clase figura
     */
    public Figura()
    {
        area=0;
    }
    
    /**
     * Calcula el area de la figura
     */
    abstract public void calcularArea();
    
    public void imprimirArea()
    {
        System.out.println("El area de la figrua es: "+area);
    }
    
    abstract public void calcularPerimetro();
    
    public void imprimirPerimetro()
    {
        System.out.println("El perimetro de la figura es: "+perimetro);
    }
}