/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/09/2019
*  Hora: 19:34
*  Wtd: Write a Java program to print the area and perimeter of a rectangle.
*/
import java.util.Scanner;
public class Exercise13{
	public static void main(String args[]){
		
		float a,b;
		Scanner Sr = new Scanner(System.in);

		System.out.println("Ingrese la base del rectangulo: ");
		a=Sr.nextFloat();
		System.out.println("Ingrese la altura del rectangulo: ");
		b=Sr.nextFloat();
		System.out.println("Perimetro = "+(2*(a+b)));
		System.out.println("Area = "+(a*b));
}
}