package hoja_7;
/*
____          _____               _ _           _
|  _ \        |  __ \             (_) |         | |
| |_) |_   _  | |__) |_ _ _ __ _____| |__  _   _| |_ ___
|  _ <| | | | |  ___/ _` | '__|_  / | '_ \| | | | __/ _ \
| |_) | |_| | | |  | (_| | |   / /| | |_) | |_| | ||  __/
|____/ \__, | |_|   \__,_|_|  /___|_|_.__/ \__, |\__\___|
       __/ |                               __/ |
      |___/                               |___/
  Blog:       https://parzibyte.me/blog
  Ayuda:      https://parzibyte.me/blog/contrataciones-ayuda/
  Contacto:   https://parzibyte.me/blog/contacto/
  Copyright (c) 2020 Luis Cabrera Benito
  Licenciado bajo la licencia MIT
  El texto de arriba debe ser incluido en cualquier redistribución
* */

public class BinaryTree {

	private node raiz;

    public BinaryTree() {

    }

    /**
     * 
     * @param busqueda
     * @return
     */
    public boolean existe(String busqueda) {
        return existe(this.raiz, busqueda);
    }

     /**
      * 
      * @param n
      * @param busqueda
      * @return
      */
    private boolean existe(node n, String busqueda) {
        if (n == null) {
            return false;
        }
        if (busqueda.equalsIgnoreCase(n.getDatoClave())) {
            return true;
        } else if (busqueda.compareTo(n.getDatoClave()) < 0) {
            return existe(n.getIzquierda(), busqueda);
        } else {
            return existe(n.getDerecha(), busqueda);
        }

    }
    
    /**
     * 
     * @param busqueda
     * @return
     */
    public String traduccion(String busqueda) {
    	return traduccion(this.raiz, busqueda);
    }
    
    
    /**
     * 
     * @param n
     * @param busqueda
     * @return
     */
    private String traduccion(node n,String busqueda) {
    	if (n == null) {
            return "";
        }
        if (busqueda.equalsIgnoreCase(n.getDatoClave())) {
            return n.getDatoTraduccion();
        } else if (busqueda.compareTo(n.getDatoClave()) < 0) {
            return traduccion(n.getIzquierda(), busqueda);
        } else {
            return traduccion(n.getDerecha(), busqueda);
        }
    }

    /**
     * 
     * @param clave
     * @param traduccion
     */
    public void insertar(String clave, String traduccion) {
        if (this.raiz == null) {
            this.raiz = new node(clave, traduccion);
        } else {
            this.insertar(this.raiz, clave,traduccion);
        }
    }

    /**
     * 
     * @param padre
     * @param dato
     * @param traduccion
     */
    private void insertar(node padre, String dato, String traduccion) {
        if (dato.compareTo(padre.getDatoClave()) > 0) {
            if (padre.getDerecha() == null) {
                padre.setDerecha(new node(dato,traduccion));
            } else {
                this.insertar(padre.getDerecha(), dato, traduccion);
            }
        } else {
            if (padre.getIzquierda() == null) {
                padre.setIzquierda(new node(dato, traduccion));
            } else {
                this.insertar(padre.getIzquierda(), dato, traduccion);
            }
        }
    }
    
    /**
     * 
     * 
     * @param clave
     * @return
     */
    public String traducir(String clave) {
    	
    	if(existe(clave)) {
    		
    		return traduccion(clave);
    	}
    	else {
    		String traduccion = "*"+clave+"*";
    		return traduccion;
    	}
    	
    }

    /**
     * 
     * @param n
     */
    private void preorden(node n) {
        if (n != null) {
            n.imprimirDatoClave();
            preorden(n.getIzquierda());
            preorden(n.getDerecha());
        }
    }

    /**
     * 
     * @param n
     */
    private void inorden(node n) {
        if (n != null) {
            inorden(n.getIzquierda());
            n.imprimirDatoClave();
            inorden(n.getDerecha());
        }
    }

    /**
     * 
     * @param n
     */
    private void postorden(node n) {
        if (n != null) {
            postorden(n.getIzquierda());
            postorden(n.getDerecha());
            n.imprimirDatoClave();
        }
    }

    /**
     * 
     */
    public void preorden() {
        this.preorden(this.raiz);
    }

    /**
     * 
     */
    public void inorden() {
        this.inorden(this.raiz);
    }

    /**
     * 
     */
    public void postorden() {
        this.postorden(this.raiz);
    }
	
}
