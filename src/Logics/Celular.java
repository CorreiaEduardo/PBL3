package Logics;

/**
 * @author Eduardo C.
 */
public class Celular extends Dispositivo{
    @Override
    public float renderizar(HTMLComponent component) {
        float proportion = 1;
        if (component instanceof Paragrafo) {
            proportion = 0.7f;
        }else if (component instanceof Link) {
            proportion = 0.7f;
        }else if (component instanceof Lista) {
            proportion = 0.7f;
        }
        return proportion;
    }
}
