/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/09/2019
*  Hora: 19:10
*  Wtd: Write a Java program to print the area and perimeter of a circle.
*/
import java.util.Scanner;
import static java.lang.Math.PI;
public class Exercise11{
	public static void main(String args[]){
	float a;
	Scanner Sr = new Scanner(System.in);
	
		System.out.println("Ingrese el valor de radio: ");
		a=Sr.nextFloat();
		System.out.println("Perimetro es ="+(2*PI*a));
		System.out.println("Area es = "+(PI*a*a));
}
}
