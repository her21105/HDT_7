package hoja_7;

import java.util.Iterator;

public class intermediario {
	
	BinaryTree diccionaryEnglish = new BinaryTree();//crear objeto arbol de ingles-español
	BinaryTree diccionaryFrench = new BinaryTree();//crear objeto arbol de frances-español
	archivo leer = new archivo();

	private void IniciarArray(String direccion) {
		leer.leerTxt(direccion); //leer el archivo		
	}
	
	private palabras tomar(int i) {//acortamiento de codigo
		return leer.diccionario.get(i);
	}
	
	private void EnglishTree() {//creador de arbol ingles-español
		for (int i = 0; i < leer.diccionario.size(); i++) {
			diccionaryEnglish.insertar(tomar(i).getEnglish(), tomar(i).getSpanish());
		}
		
	}
	
	private void FrenchTree() {// creardor de arbol frances-español
		for (int i = 0; i < leer.diccionario.size(); i++) {
			diccionaryFrench.insertar(tomar(i).getFrench(),tomar(i).getSpanish());
		}
	}
	
	public void iniciar(String direccion) {//usar al inicio de main, este perimte crear los arboles
		IniciarArray(direccion);
		EnglishTree();
		FrenchTree();
	}
	
	public String traducirTxt(String direccion) {
		
		String[] traducir = leer.leerTxtTraducir(direccion); //direccion del archivo a traducir
		String texto = "";
			for (int i = 0; i < traducir.length; i++) {
				if(diccionaryEnglish.existe(traducir[i])) {
					
					for (int j = 0; j < traducir.length; j++) {
						
						texto += diccionaryEnglish.traducir(traducir[j])+" ";
						
					}
					
					return texto;
					
				}else if(diccionaryFrench.existe(traducir[i])) {
					
						
						for (int j = 0; j < traducir.length; j++) {
							
							texto += diccionaryFrench.traducir(traducir[j])+" ";
							
						}
						
						return texto;
				
			}
		}
			
		texto = "el idioma del archivo no esta disponible o ninguna palabra del archivo conincide con la de la base de datos, por lo que se le solicita agregar las palabras restantes";
		return texto;
	}
	
}
