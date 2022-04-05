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

    public boolean existe(String busqueda) {
        return existe(this.raiz, busqueda);
    }

    private boolean existe(node n, String busqueda) {
        if (n == null) {
            return false;
        }
        if (n.getDatoClave().equals(busqueda)) {
            return true;
        } else if (busqueda.compareTo(n.getDatoClave()) < 0) {
            return existe(n.getIzquierda(), busqueda);
        } else {
            return existe(n.getDerecha(), busqueda);
        }

    }

    public void insertar(String clave, String traduccion) {
        if (this.raiz == null) {
            this.raiz = new node(clave, traduccion);
        } else {
            this.insertar(this.raiz, clave,traduccion);
        }
    }

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

    private void preorden(node n) {
        if (n != null) {
            n.imprimirDatoClave();
            preorden(n.getIzquierda());
            preorden(n.getDerecha());
        }
    }

    private void inorden(node n) {
        if (n != null) {
            inorden(n.getIzquierda());
            n.imprimirDatoClave();
            inorden(n.getDerecha());
        }
    }

    private void postorden(node n) {
        if (n != null) {
            postorden(n.getIzquierda());
            postorden(n.getDerecha());
            n.imprimirDatoClave();
        }
    }

    public void preorden() {
        this.preorden(this.raiz);
    }

    public void inorden() {
        this.inorden(this.raiz);
    }

    public void postorden() {
        this.postorden(this.raiz);
    }
	
}
