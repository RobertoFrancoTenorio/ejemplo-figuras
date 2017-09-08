/**
 * Esta clase es un super clase para representar las
 * caracteristicas comunes de muchas figuras
 * 
 * @Autor: Roberto Franco
 * @version 1.0
 */
public class Figura
{
    protected float area;
    
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
    public void calcularArea()
    {
        System.out.println("No se como calcular el area");
    }
    
    public void imprimirArea()
    {
        System.out.println("El area de la figrua es: "+area);
    }
}