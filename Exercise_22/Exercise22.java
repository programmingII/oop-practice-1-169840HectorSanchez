/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/15/2019
*  Hora: 22:40
*  Wtd: Write a Java program to convert a binary number to decimal number. 
*/
import java.util.Scanner;
public class Exercise22{
	public static void main(String[] args){
		String x;
	Scanner Sr = new Scanner(System.in);
System.out.println("Ingrese el valor binario que desee convertir a Decimal: ");
	x=Sr.nextLine();
int Decimal = Integer.parseInt(x, 2);
System.out.println("Resultado: "+Decimal);

}
}