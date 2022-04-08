package hoja_7;
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

		//objetos
		intermediario inter = new intermediario();
		//inicio
		String direccionDiccionario = "C:\\Users\\Joabh\\Desktop\\prueba\\diccionario.txt";
		String direccionTraducir = "C:\\Users\\Joabh\\Desktop\\prueba\\traducir.txt";
		inter.iniciar(direccionDiccionario); //ingresar direccionDiccionar
		System.out.println(inter.traducirTxt(direccionTraducir)); //ingresar direccionTraducir
		//menu
		
	}

}
