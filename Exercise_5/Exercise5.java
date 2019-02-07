/*  @autor: Hector_Sanchez_169840
*  @date> 02/07/19
* @timeStart: 12:20
* WTD: Write a Java program that takes two numbers as input and display the product of two numbers
*/

import java.util.Scanner;
// Lectura de datos
public class Exercise5{
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int a,b;
	
		System.out.println("Ingrese el primer valor: ");
			a= input.nextInt();
		System.out.println("Ingrese el siguiente valor: ");
			b= input.nextInt();
		System.out.println(a+" X "+b+" = "+a*b);
		
}
}