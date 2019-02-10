/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/09/2019
*  Hora: 19:51
*  Wtd: Write a Java program to swap two variables
*/
import java.util.Scanner;
public class Exercise15{
	public static void main(String args[]){
		Scanner Sr = new Scanner(System.in);
		int a,b,temporal;
		
		System.out.println("Ingrese el primer termino: ");
		a = Sr.nextInt();
		System.out.println("Ingrese el siguiente termino: ");
		b = Sr.nextInt();
		System.out.println("El termino a es: "+a);
		System.out.println("El termino b es: "+b);
		temporal=a;
		a=b;
		b=temporal;
		System.out.println("El termino a es: "+a);
		System.out.println("El termino b es: "+b);
		
		
		
		
}
}