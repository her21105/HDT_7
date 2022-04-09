package hoja_7;

import java.util.Scanner;

/**
 * 
 * @author Joab hernandez
 * para el correcto funcionamiento del programa se recomienda que el archivo txt de traduccion
 * no tenga espacios y solo ","
 *
 */
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables
		int seleccion;
		Scanner scan = new Scanner(System.in);
		
		//objetos
		intermediario inter = new intermediario();
		//inicio
		String direccionDiccionario = "C:\\Users\\Joabh\\Desktop\\prueba\\diccionario.txt";
		String direccionTraducir = "C:\\Users\\Joabh\\Desktop\\prueba\\traducir.txt";
		inter.iniciar(direccionDiccionario); //ingresar direccionDiccionar
		
		//menu
		System.out.println("seleccione una opción \n"
				+ "1.traducir archivo \n"
				+ "2.agregar palabra nueva al diccionario (recuerde que tiene que tener la palabra en ingles, español y frances)");
		
		seleccion = Integer.parseInt(scan.nextLine());
		
		switch (seleccion) {
		case 1: 
				
			System.out.println(inter.traducirTxt(direccionTraducir)); //ingresar direccionTraducir
			
			break;
		
		case 2:
			
			String english;
			String spanish;
			String French;
			
			System.out.println("ingrese la palabra en español");
			spanish = scan.nextLine();
			System.out.println("ingrese la palabra en ingles");
			english = scan.nextLine();
			System.out.println("ingrese la palabra en frances");
			French = scan.nextLine();
			
			inter.addTraductor(direccionDiccionario, english, spanish, French);
			
			break;
		
		default:
			System.out.println("seleccione una de las opciones por favor");
		}
	}

}
