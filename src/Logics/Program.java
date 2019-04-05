package Logics;

/**
 * @author Eduardo C.
 */
public class Program {
    public static void main(String[] args) {
        
        Paragrafo p1 = new Paragrafo();
        p1.setSize(1f);
        p1.setColor("Azul");
        
        Link link1 = new Link();
        link1.setSize(1f);
        link1.setColor("Azul");
        
        Lista lista1 = new Lista();
        lista1.setSize(1f);
        lista1.setColor("Azul");
        
        
        Desktop d = new Desktop();
        Notebook n = new Notebook();
        Tablet t = new Tablet();
        Celular c = new Celular();
        System.out.println("O paragrafo será renderizado no Desktop com o tamanho de: "+p1.getSize()*d.renderizar(p1));
        System.out.println("O paragrafo será renderizado no Notebook com o tamanho de: "+p1.getSize()*n.renderizar(p1));
        System.out.println("O paragrafo será renderizado no Tablet com o tamanho de: "+p1.getSize()*t.renderizar(p1));
        System.out.println("O paragrafo será renderizado no Celular com o tamanho de: "+p1.getSize()*c.renderizar(p1));
        
        System.out.println("O link será renderizado no Desktop com o tamanho de: "+p1.getSize()*d.renderizar(link1));
        System.out.println("O link será renderizado no Notebook com o tamanho de: "+p1.getSize()*n.renderizar(link1));
        System.out.println("O link será renderizado no Tablet com o tamanho de: "+p1.getSize()*t.renderizar(link1));
        System.out.println("O link será renderizado no Celular com o tamanho de: "+p1.getSize()*c.renderizar(link1));
        
        System.out.println("A lista será renderizado no Desktop com o tamanho de: "+p1.getSize()*d.renderizar(lista1));
        System.out.println("A lista será renderizado no Notebook com o tamanho de: "+p1.getSize()*n.renderizar(lista1));
        System.out.println("A lista será renderizado no Tablet com o tamanho de: "+p1.getSize()*t.renderizar(lista1));
        System.out.println("A lista será renderizado no Celular com o tamanho de: "+p1.getSize()*c.renderizar(lista1));
    }
}
