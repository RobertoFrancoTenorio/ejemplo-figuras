/**
 * Esta clase es un super clase para representar las
 * caracteristicas comunes de muchas figuras
 * 
 * @author: Roberto Franco
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
    
    /**
     * Muestra el area de la figura
     */
    public void imprimirArea()
    {
        System.out.println("El area de la figrua es: "+area);
    }
    
    /**
     * Calcula el perimetro de la figura
     */
    abstract public void calcularPerimetro();
    
    /**
     * Muestra el perimetro de la figura
     */
    public void imprimirPerimetro()
    {
        System.out.println("El perimetro de la figura es: "+perimetro);
    }
}