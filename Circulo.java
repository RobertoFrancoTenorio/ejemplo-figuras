/**
 * Esta clase reoresanta objetos con un radio
 * @author Roberto Franco   
 * @version 1.0
 */
public class Circulo extends Figura
{
    private float radio;
    
    public Circulo(float unRadio)
    {
        radio=unRadio;
    }
    
    @Override
    public void calcularArea()
    {
        area= 3.14f * radio * radio;
    }
}