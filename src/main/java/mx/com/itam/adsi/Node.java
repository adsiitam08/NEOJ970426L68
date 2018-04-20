package mx.com.itam.adsi;

//import org.apache.log4j.Logger;

/**
* Clase de un nodo de una lista ligada unidireccional.
* Un objeto Node tiene datos y siguiente, permitiendo
* crear y recorrer la lista.
*/
class Node {
	String data;
	Node next;
	//private final static Logger LOG = Logger.getLogger(Node.class);

	/**
	* Constructor predeterminado.
	* @param data Información a guardar dentro del nodo.
	*/
	Node(String data) {
	    this.data = data;
	}
	/**
	* Regresa el último nodo de la lista que comienza
	* en el nodo actual. Por ejemplo, si fuera una lista
	* de tamaño 6, regresaría el sexto nodo de esta.
	*
	* @return Node El último nodo de la lista.
	*/        
	Node gus() {
	    //LOG.info("Entre al método gus en el nodo: " + this.data);
	    if(next == null) return this; //revisa si este es el último nodo
	    Node otro = next;
	    next      = null;
	    Node tavo = otro.gus();
	    otro.next = this;
	    return tavo;
	}

	/**
	 * Imprime en la consola la secuencia de Nodos que 
	 * componen a esta lista. Por ejemplo, para la lista
	 * que devuelve el método "build", la invocación de
	 * este método escribe en la consola: 
	 * 
	 * A-->B-->C-->D-->E-->F-->
	 * 
	 * Lo anterior sería lo que se visualiza en la consola 
	 * justo después de ejecutar las siguintes dos lineas:
	 * 
	 *         Node a = build();
	 *         a.prn();
	 *         
	 */
	void prn() {
		//LOG.info("Entramos a prn e imprimiremos la lista que empieza con: " + this.data);
		Node sig = this.next;
		String s = ""; //declaramos un string inicial
		while(sig != null){ //iteramos por toda la lista hasta encontrar un nulo
			s = s + sig.data + "-->"; //concatenamos el string
			sig = sig.next;
			//LOG.Info("Lista hasta el momento: " + s);
		}
		System.out.print(s);
	    // Este método requiere sólo de 3 a 7 lineas de código para funcionar correctamente
	}

}// ends Node class
