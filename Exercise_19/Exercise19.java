/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Día: 15/02/2019
*  Hora: 21:33
*  WTD: Write a Java program to convert a decimal number to binary number.
*/
import java.util.Scanner;
public class Exercise19{
	public static void main(String[] args){
	
	int x;
	Scanner Sr = new Scanner(System.in);
System.out.println("Ingresa el primer numero: ");
	x=Sr.nextInt();
System.out.println(Integer.toBinaryString(x));

}
}