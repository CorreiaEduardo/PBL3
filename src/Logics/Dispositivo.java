package Logics;

import java.util.ArrayList;

/**
 * @author Eduardo C.
 */
public abstract class Dispositivo {
    private ArrayList<Paragrafo> paragrafos = new ArrayList<>();
    private ArrayList<Link> links = new ArrayList<>();
    private ArrayList<Lista> listas = new ArrayList<>();
    
    public abstract float renderizar(HTMLComponent component);
}
