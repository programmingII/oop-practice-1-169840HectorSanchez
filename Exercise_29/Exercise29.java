/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/18/2019
*  Hora: 20:46
*  Wtd: Write a Java program to convert a hexadecimal to a binary number. 
*/
import java.util.Scanner;
public class Exercise29{
	public static void main(String[] args){
	String x;
	Scanner Sr = new Scanner(System.in);
/**/
System.out.println("Ingrese el valor Hexadecimal que desee convertir a Binario: ");
	x=Sr.nextLine();
	int HexDecimal = Integer.parseInt(x, 16);
	String Binary = Integer.toString(HexDecimal,2);
	System.out.println("Resultado: "+ Binary);
}
}