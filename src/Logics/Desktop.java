package Logics;

/**
 * @author Eduardo C.
 */
public class Desktop extends Dispositivo{

    @Override
    public float renderizar(HTMLComponent component) {
        float proportion = 1;
        if (component instanceof Paragrafo) {
            proportion = 2.5f;
        }else if (component instanceof Link) {
            proportion = 2.2f;
        }else if (component instanceof Lista) {
            proportion = 2.5f;
        }
        return proportion;
    }
    
}
