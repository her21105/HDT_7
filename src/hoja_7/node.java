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
  El texto de arriba debe ser incluido en cualquier redistribuci�n
* */
public class node {
	
	private String clave;
	private String traduccion;
	
	private Association<String, String> dato = new Association<String, String>(clave, traduccion);
    private node izquierda, derecha;

    public node(String clave, String traduccion) {
        this.dato = new Association<String, String>(clave,traduccion);
        this.izquierda = this.derecha = null;
    }


    public String getDatoClave() {
        return dato.getClave();
    }
    
    public String getDatoTraduccion() {
    	return dato.getTraduccion();
    }

    public node getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(node izquierda) {
        this.izquierda = izquierda;
    }

    public node getDerecha() {
        return derecha;
    }

    public void setDerecha(node derecha) {
        this.derecha = derecha;
    }

    public void imprimirDatoClave() {
        System.out.println(this.getDatoClave());
    }
    
    public void imprimirDatoTraduccion() {
    	System.out.println(this.getDatoTraduccion());
    }
	

}
