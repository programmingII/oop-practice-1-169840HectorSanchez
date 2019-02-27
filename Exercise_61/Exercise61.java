/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/27/2019
*  Hora: 16:27
*  Wtd: Write a Java program to reverse a word. 
*/
import java.util.Scanner; //Libreria Scanner 
public class Exercise61{
	public static void main(String[] args){
	Scanner Sr = new Scanner(System.in);
	//Crea objeto scanner 
		//guardara lo Requerido 
	System.out.println("Ingresa la frase: ");//Muestra lo que le pide al user 
	String frase = Sr.nextLine();//Recibe y guarda en frase la nextline.
	System.out.println("Frase al revez: "+new StringBuilder(frase).reverse().toString());
	
}
}