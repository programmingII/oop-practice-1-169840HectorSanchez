/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/15/2019
*  Hora: 23:17
*  Wtd: Write a Java program to convert a binary number to a Octal number.
*/

import java.util.Scanner;
public class Exercise24{
	public static void main(String[] args){
	String x;
	Scanner Sr = new Scanner(System.in);
System.out.println("Ingrese el valor binario que desee convertir a Octal: ");
	x=Sr.nextLine();
	int Decimal = Integer.parseInt(x, 2);
	String Octal = Integer.toString(Decimal,8);
	System.out.println("Resultado: "+ Octal);
}
}