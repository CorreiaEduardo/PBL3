package Logics;

/**
 * @author Eduardo C.
 */
public class Tablet extends Dispositivo{
    @Override
    public float renderizar(HTMLComponent component) {
        float proportion = 1;
        if (component instanceof Paragrafo) {
            
        }else if (component instanceof Link) {
            
        }else if (component instanceof Lista) {
            
        }
        return proportion;
    }
}
