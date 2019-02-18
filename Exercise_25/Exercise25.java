/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/18/2019
*  Hora: 10:38
*  Wtd: Write a Java program to convert a octal number to a decimal number.
*/
import java.util.Scanner;
public class Exercise25{
	public static void main(String[] args){
	String x;
	Scanner Sr = new Scanner(System.in);
/**/
System.out.println("Ingrese el valor Octal que desee convertir a Decimal: ");
	x=Sr.nextLine();
	int Octal = Integer.parseInt(x, 8);
	String Decimal = Integer.toString(Octal,10);
	System.out.println("Resultado: "+ Decimal);
}
}