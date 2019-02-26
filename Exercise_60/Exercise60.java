/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/26/2019
*  Hora: 12:34
*  Wtd: Write a Java program to find the penultimate (next to last) word of a sentence.
*/
import java.util.Scanner; //Libreria Scanner 
public class Exercise60{
	public static void main(String[] args){
	Scanner Sr = new Scanner(System.in);
	//Crea objeto scanner 
		//guardara lo Requerido 
	System.out.println("Ingresa la frase: ");
	String frase = Sr.nextLine();
	String[] palabras = frase.split("[ ]+") ;
	/*split(String regex)
	Splits this string around matches of the given regular expression.*/
	System.out.println("Penultima palabra: "+palabras[palabras.length-2]);
}
}