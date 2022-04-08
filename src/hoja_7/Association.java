package hoja_7;

public class Association<K,V> {

	private K clave;
	private V traduccion;
	
	public Association(K clave, V traduccion) {
		
		this.clave = clave;
		this.traduccion = traduccion;
		
	}

	public K getClave() {
		return clave;
	}

	public void setClave(K clave) {
		this.clave = clave;
	}

	public V getTraduccion() {
		return traduccion;
	}

	public void setTraduccion(V traduccion) {
		this.traduccion = traduccion;
	}
	
	
	
	
	
}
