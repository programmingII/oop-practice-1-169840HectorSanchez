/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/15/2019
*  Hora: 22:00
*  Wtd: Write a Java program to convert a decimal number to hexadecimal number.
*/
import java.util.Scanner;
public class Exercise20{
	public static void main(String[] args){
	
	int x;
	Scanner Sr = new Scanner(System.in);
System.out.println("Ingresa el numero Decimal que desee convertir a Hexadecimal: ");
x=Sr.nextInt();
System.out.println("Resultado: "+Integer.toHexString(x));
/*Integer.toHexString(int i): Returns a string representation of the integer argument as an unsigned integer in base 16.
Ref: https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html */

}
}