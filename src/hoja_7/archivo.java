package hoja_7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class archivo {

	public archivo() {
		
	}
	
	ArrayList<palabras> diccionario = new ArrayList<palabras>(); //lista de objetos palabras que contienen las palabras (ingles, español y frances)
	
	/**
	 * 
	 * @param direccion
	 */
	public void leerTxt(String direccion) {
		
		try {
			
			BufferedReader bf = new BufferedReader(new FileReader(direccion));
			
			String bfReader;
			while((bfReader = bf.readLine()) != null) {//hacer el ciclo mientras exista una linea con datos
				
				String tempo = "";
				tempo = bfReader;
				String[] tempo2 = tempo.split(",");
				palabras A1 = new palabras(tempo2[0],tempo2[1],tempo2[2]);
				diccionario.add(A1);
				
			}
			
		}catch(Exception e) {
			System.out.println("error, verifique la dirección");
		}
		
	}
	
	public String[] leerTxtTraducir(String direccion) {
		
		try {

			ArrayList<String> tempolist = new ArrayList<String>();//array para guardar muchos Strings
			
			BufferedReader bf = new BufferedReader(new FileReader(direccion));
			
			String bfReader;
			while((bfReader = bf.readLine()) != null) {//hacer el ciclo mientras exista una linea con datos
				
				String tempo = "";
				tempo = bfReader;
				String[] tempo2 = tempo.split(" "); //String que solo almacena Strings sin saltos
				for (int i = 0; i < tempo2.length; i++) {
					tempolist.add(tempo2[i]); //almacenar Strings en tempolist
				}
				
			}
			
			String[] traduc = new String[tempolist.size()];//crear un array 
			
			for (int i = 0; i < tempolist.size(); i++) {
				traduc[i] = tempolist.get(i);
			}
			
			
			return traduc;
			
		}catch(Exception e) {
			System.out.println("error, verifique la dirección");
			return null;
		}
		
		
	}
	
}
