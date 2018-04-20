package mx.com.itam.adsi;

import org.apache.log4j.Logger;

/**
* Solución para el segundo examen parcial
* de la materia Análisis y Diseño de Sistemas
* de Información del ITAM (primavera 2018).
*/
public class Solucion {

    private final static Logger LOG = Logger.getLogger(Solucion.class);
    /**
     * Método de construcción de una lista de Nodos de tamaño 6.
     * 
     * @return Node El primer nodo de la lista.
     */
    private Node build() {
        LOG.info("Entré al método build()");
        Node n1 = new Node("A");
        Node n2 = new Node("B");
        Node n3 = new Node("C");
        Node n4 = new Node("D");
        Node n5 = new Node("E");
        Node n6 = new Node("F");
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        return n1;
    }

    /**
     * Prueba la funcionalidad de el método "gus" con distintos casos de prueba
     */
    public void ok() {
	LOG.info("Comienza la prueba");
        Node a = build();
        a.prn();
        a = a.gus();
        a.prn();
        a = a.gus();
        a.prn();
        
        Node b = new Node("X");
        b = b.gus();
        b.prn();
        
        Node c = new Node("X");
        Node d = new Node("Y");
        c.next = d;
        c = c.gus();
        c.prn();   
    }

    /**
     * Método main que crea un nodo y ejecuta la prueba 
     */
    public static void main(String...argv) {
        new Solucion().ok();
    }

}

