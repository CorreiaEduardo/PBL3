package Logics;

/**
 * @author Eduardo C.
 */
public class Program {
    public static void main(String[] args) {
        Paragrafo p1 = new Paragrafo();
        p1.setSize(50);
        p1.setColor("Azul");
        Desktop d = new Desktop();
        Notebook n = new Notebook();
        Tablet t = new Tablet();
        Celular c = new Celular();
        System.out.println("O paragrafo será renderizado no Desktop com o tamanho de: "+p1.getSize()*d.renderizar(p1));
        System.out.println("O paragrafo será renderizado no Notebook com o tamanho de: "+p1.getSize()*n.renderizar(p1));
        System.out.println("O paragrafo será renderizado no Tablet com o tamanho de: "+p1.getSize()*t.renderizar(p1));
        System.out.println("O paragrafo será renderizado no Celular com o tamanho de: "+p1.getSize()*c.renderizar(p1));
    }
}
