/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/28/2019
*  Hora: 00:45
*  Wtd: Write a Java program to extract the first half of a string of even length. 
*/
import java.util.Scanner; //Libreria Scanner 
public class Exercise69{
	public static void main(String[] args){
	Scanner Sr = new Scanner(System.in);
	//Crea objeto scanner 
		//guardara lo Requerido 
	System.out.println("Ingresa la palabra: ");
	String frase = Sr.nextLine();//Recibe y guarda en frase la nextline.
	int x = frase.length();

	System.out.println(frase.substring(0,x/2));
/*Utilice el mismo que el 68, pero con una diferencia, este tiene unfinal index:
substring(int beginIndex, int endIndex)
Returns a new string that is a substring of this string.*/
	
}
}