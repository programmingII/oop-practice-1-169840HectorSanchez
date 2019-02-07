/*Nombre: Hector_Gerardo_Sanchez_Quiroga
* Dia: 05/02/19
* Hora: 13:24 
* Write a Java program to divide two numbers and print on the screen.
*/
import java.util.Scanner;
// Lectura de datos
public class Exercise3{

	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	int a,b,sdiv;
		
	//Se crearon 3 diferentes variables, en las que a sdiv, se le asignara el valor de a/b
	System.out.println("Ingrese el primer valor: ");
	a = input.nextInt();
	System.out.println("Ingrese el segundo valor: ");
	b= input.nextInt();
	sdiv=a/b;
	System.out.println(sdiv);

}
}
