/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/15/2019
*  Hora: 23:05
*  Wtd: Write a Java program to convert a binary number to hexadecimal number. 
*/

import java.util.Scanner;
public class Exercise23{
	public static void main(String[] args){
		String x;
	Scanner Sr = new Scanner(System.in);
System.out.println("Ingrese el valor binario que desee convertir a Hexadecimal: ");
	x=Sr.nextLine();
int Decimal = Integer.parseInt(x, 2);
String Hex = Integer.toString(Decimal,16);
System.out.println("Resultado: "+ Hex);

}
}