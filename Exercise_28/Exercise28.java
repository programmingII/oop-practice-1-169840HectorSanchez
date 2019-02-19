/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/18/2019
*  Hora: 20:40
*  Wtd: Write a Java program to convert a hexadecimal to a decimal number.
*/
import java.util.Scanner;
public class Exercise28{
	public static void main(String[] args){
	String x;
	Scanner Sr = new Scanner(System.in);
/**/
System.out.println("Ingrese el valor Hexadecimal que desee convertir a Decimal: ");
	x=Sr.nextLine();
	int HexDecimal = Integer.parseInt(x, 16);
	String Decimal = Integer.toString(HexDecimal,10);
	System.out.println("Resultado: "+ Decimal);
}
}