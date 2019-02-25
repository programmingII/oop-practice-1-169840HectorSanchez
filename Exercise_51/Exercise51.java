/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/25/2019
*  Hora: 8:51
*  Wtd: Write a Java program to convert a string to an integer in Java.
*/
import java.util.Scanner;
public class Exercise51{
	public static void main(String[] args){
	Scanner Sr = new Scanner(System.in);
	//Crea objeto scanner 
		//guardara lo Requerido 
	System.out.println("Ingresa el numero: ");
	String x = Sr.nextLine();
	int y=Integer.parseInt(x);
	System.out.println("El numero en valor de entero es: "+y);
}
}