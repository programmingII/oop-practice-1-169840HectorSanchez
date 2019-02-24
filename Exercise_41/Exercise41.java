/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/24/2019
*  Hora: 14:17
*  Wtd: Write a Java program to print the ascii value of a given character. 
*/
import java.util.Scanner;
public class Exercise41 {
  public static void main(String[] args) {
	Scanner Sr = new Scanner(System.in);
	//Crea objeto scanner 
		//guardara lo Requerido 
	System.out.println("Ingresa el caracter: ");
	char ch = Sr.next().charAt(0);
/*Se debe utilizar esta funcion para que ocurra: Ref:https://stackoverflow.com/questions/5012113/nextchar-in-java*/
	int x = ch;
	/*Hare esto para convertir el valor del caracter en un valor entero
	ReF: https://www.javatpoint.com/java-char-to-int*/
	System.out.println("El valor Ascii es: "+x);
	
  }
}