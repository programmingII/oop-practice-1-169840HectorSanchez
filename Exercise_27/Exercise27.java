/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/18/2019
*  Hora: 11:42
*  Wtd: Write a Java program to convert a octal number to a hexadecimal number.
*/
import java.util.Scanner;
public class Exercise27{
	public static void main(String[] args){
	String x;
	Scanner Sr = new Scanner(System.in);
/**/
System.out.println("Ingrese el valor Octal que desee convertir a Hexadecimal: ");
	x=Sr.nextLine();
	int Octal = Integer.parseInt(x, 8);
	String HexDecimal = Integer.toString(Octal,16);
	System.out.println("Resultado: "+ HexDecimal);
}
}