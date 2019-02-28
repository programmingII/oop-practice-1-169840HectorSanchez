/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/27/2019
*  Hora: 16:27
*  Wtd: Write a Java program to create a new string of 4 copies of the last 3 *  characters of the original string. The length of the original string must be 3 *  and above.
*/
import java.util.Scanner; //Libreria Scanner 
public class Exercise68{
	public static void main(String[] args){
	Scanner Sr = new Scanner(System.in);
	//Crea objeto scanner 
		//guardara lo Requerido 
	System.out.println("Ingresa la frase: ");//Muestra lo que le pide al user 
	String frase = Sr.nextLine();//Recibe y guarda en frase la nextline.
	String tresFinales = frase.substring(frase.length()-3);
	/*Parte de una string es un substring. Puedes usar:
	substring(int beginIndex)
	Returns a new string that is a substring of this string.*/
//Aqui solo se concatena las 3 subcadenas
	System.out.println(tresFinales+tresFinales+tresFinales+tresFinales);
}
}