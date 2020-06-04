package Pilas;

public class Pila {

	/*
	public class Nodo {
        int edad; //dato de la lista
        String nombre; 
        Nodo sig; //puntero de la lista
    }
    */

	private Nodo raiz; //Crear un objeto de tipo nodo
	
	/**
	 * Constructor de la clase
	 */
	public Pila () {
        raiz=null; //Instanciar un objeto tipo nodo;
    }
	
	/**
	 * Metodo para insertar un nodo en una lista tipo pila
	 * @param x //valor para el nodo
	 */
	public void insertar(int x, String nombre) {
    	Nodo nuevo;
        nuevo = new Nodo();
        nuevo.edad = x;
        nuevo.nombre = nombre;
        //Validar si la lista esta vacia
        if (raiz==null)
        {
            nuevo.sig = null;
            raiz = nuevo;
        }
        else
        {
            nuevo.sig = raiz;
            raiz = nuevo;
        }
    }
	
	/**
	 * Eliminar un nodo de la lista tipo pila
	 * @return valor del nodo eliminado
	 */
	public int extraer ()
    {
        if (raiz!=null)
        {
            int informacion = raiz.edad;
            raiz = raiz.sig;
            return informacion;
        }
        else
        {
            System.out.println("La lista se encuentra vacia");
            return 0;
        }
    }
	
	/**
	 * Metodo para imprimir la lista
	 */
	public void imprimir() {
        Nodo reco=raiz;
        System.out.println("Listado de todos los elementos de la pila.");
        System.out.print("Raiz-");
        while (reco!=null) {
        	System.out.print("(");
            System.out.print(reco.edad+"-");
            System.out.print(reco.nombre+"");
            System.out.print(")-");
            //System.out.print(reco.sig+"-");
            reco=reco.sig;
        }
        System.out.print("Cola");
        System.out.println();
    }

	public static void main(String[] args) {
		Pila p = new Pila();
		p.insertar(10,"Juan Perez");
		p.imprimir();
		p.insertar(40,"Lina Lopez");
		p.imprimir();
		p.insertar(3, "Pedro Lopez");
		p.imprimir();
		System.out.println("Extraer "+p.extraer());
		p.imprimir();
		System.out.println("Extraer "+p.extraer());
		p.imprimir();
		System.out.println("Extraer "+p.extraer());
		p.imprimir();
		System.out.println("Extraer "+p.extraer());
		p.imprimir();

	}

}
