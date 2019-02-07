/*  Nombre: Hector_Sanchez_169840
*  Dia: 02/07/19
* Hora: 12:40
* WTD: Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
*/

import java.util.Scanner;
// Lectura de datos
public class Exercise6{
	public static void main(String args[]) {
		
		Scanner Sr = new Scanner(System.in);
		int a,b;
			
			System.out.println("Ingrese el primer valor: ");
			a= Sr.nextInt();
//This method scans the next token of the input as an int.
			System.out.println("Ingrese el siguiente valor: ");
			b=Sr.nextInt();
//Se tomaron los datos
//Se realizaran las operaciones requeridas.
	//Suma
			System.out.println(a+" + "+b+" = "+(a+b));
	//Multiplicacion
			System.out.println(a+" X "+b+" = "+(a*b));
	//Resta
			System.out.println(a+" - "+b+" = "+(a-b));
	//Division
			System.out.println(a+" / "+b+" = "+(a/b));
	//Mod
			System.out.println(a+" mod "+b+" = "+(a%b));
}
}
