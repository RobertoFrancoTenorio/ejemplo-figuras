import java.util.ArrayList;
/**
 * Un cuaderno de figuras
 * @author Roberto Franco
 * @version 13/09/17
 */

public class Cuaderno
{
    private ArrayList<Figura> figuras;
    //private Figura [] figuras;
    
    /**
     * Constructor
     */
    
    public Cuaderno()
    {
        figuras = new ArrayList<Figura>();
        //figuras = new Figura[100]; <---- Esta declarando un ArrayList de Figuras
    }
    
    /**
     * Agrega una figura
     * @param unaFigura es la figura que se agrega
     */
    public void agregaFigura(Figura unaFigura)
    {
        figuras.add(unaFigura);
    }
    
    public void  calcularAreas()
    {
        for(int i=0; i<figuras.size(); i++)
        {
            figuras.get(i).calcularArea();
        }
    }
    
    public void imprimirAreas()
    {
        for(int i=0; i<figuras.size();i++)
        {
            figuras.get(i).imprimirArea();
        }
    }
}