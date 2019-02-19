/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/18/2019
*  Hora: 20:50
*  Wtd: Write a Java program to convert a hexadecimal to a octal number. 
*/
import java.util.Scanner;
public class Exercise30{
	public static void main(String[] args){
	String x;
	Scanner Sr = new Scanner(System.in);
/**/
System.out.println("Ingrese el valor Hexadecimal que desee convertir a Octal: ");
	x=Sr.nextLine();
	int HexDecimal = Integer.parseInt(x, 16);
	String Octal = Integer.toString(HexDecimal,8);
	System.out.println("Resultado: "+ Octal);
}
}