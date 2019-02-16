/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/15/2019
*  Hora: 22:10
*  Wtd: Write a Java program to convert a decimal number to octal number.
*/

import java.util.Scanner;
public class Exercise21{
	public static void main(String[] args){
	
	int x;
	Scanner Sr = new Scanner(System.in);
System.out.println("Ingrese el numero Decimal que desee convertir a Octal: ");
x=Sr.nextInt();
System.out.println("Resultado: "+Integer.toOctalString(x));
/*Returns a string representation of the integer argument as an unsigned integer *in base 8.
* Ref: https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html
*/
}
}