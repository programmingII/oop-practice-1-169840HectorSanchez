/*Hector_Gerardo_Sanchez_Quiroga
* 12:51 
* 05/02/19
* Write a Java program to print the sum of two numbers.
*/
import java.util.Scanner;
// Lectura de datos
public class Exercise2{

	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	float a,b,sum;
		
	//Se crearon 3 diferentes variables, en las que a Sum, se le asignara el valor de a+b
	System.out.println("Ingrese el primer valor: ");
	a = input.nextFloat();
	System.out.println("Ingrese el segundo valor: ");
	b= input.nextFloat();
	sum=a+b;
	System.out.println(sum);

}
}