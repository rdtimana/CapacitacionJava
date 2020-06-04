package Cola;

/**
 * Clase para el manejo de Colas
 * @author 	josemauricio
 * @since	06/01/2020
 * @version	1
 */
public class Cola {

	private Nodo raiz,fondo;
    
	/**
	 * Constructor de la clase
	 */
    Cola() {
        raiz=null;
        fondo=null;
    }

    /**
     * Valida si la lista esta vacia
     * @return boolean
     */
    boolean vacia(){
        if (raiz == null)
            return true;
        else
            return false;
    }

    /**
     * Metodo para insertar un nodo a la lista tipo cola
     * @param info
     */
    void insertar (int info)
    {
        Nodo nuevo = new Nodo ();
        nuevo.info = info;
        nuevo.sig = null;
        if (vacia()) {
            raiz = nuevo;
            fondo = nuevo;
        } else {
            fondo.sig = nuevo;
            fondo = nuevo;
        }
    }

    /**
     * Metodo para extraer un nodo de la lista
     * @return int //valor del nodo eliminado
     */
    int extraer ()
    {
        if (!vacia())
        {
            int informacion = raiz.info;
            if (raiz == fondo){
                raiz = null;
                fondo = null;
            } else {
                raiz = raiz.sig;
            }
            return informacion;
        } else
            return Integer.MAX_VALUE;
    }

    /**
     * Metodo para imprimir la lista tipo cola
     */
    public void imprimir() {
        Nodo reco=raiz;
        System.out.println("Listado de todos los elementos de la cola.");
        while (reco!=null) {
            System.out.print(reco.info+"-");
            reco=reco.sig;
        }
        System.out.println();
    }
	
	public static void main(String[] args) {
		Cola cola1=new Cola();
        cola1.insertar(5);
        cola1.imprimir();
        cola1.insertar(10);
        cola1.imprimir();
        cola1.insertar(50);
        cola1.imprimir();
        System.out.println("Extraemos uno de la cola:"+cola1.extraer());
        cola1.imprimir();     

	}

}
