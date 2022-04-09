package hoja_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
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
	
	public void agregar(String direccion, String english, String spanish, String french) {
		
		File f;
		FileWriter w;
		BufferedWriter bw;
		PrintWriter wr;
		
		try {
			
			f = new File(direccion);
			w = new FileWriter(f);
			bw = new BufferedWriter(w);
			wr = new PrintWriter(bw);
			
			wr.write(english+","+spanish+","+french);
			
			wr.close();
			bw.close();
			
		}catch(Exception e) {
			System.out.println("error en la escritura");
		}
		
	}
	
}
