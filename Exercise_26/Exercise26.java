/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/18/2019
*  Hora: 11:19
*  Wtd: Write a Java program to convert a octal number to a binary number.
*/
import java.util.Scanner;
public class Exercise26{
	public static void main(String[] args){
	String x;
	Scanner Sr = new Scanner(System.in);

	System.out.println("Ingrese el valor Octal que desee convertir a Binario: ");
	x=Sr.nextLine();
	int Octal = Integer.parseInt(x, 8);
	String Binary = Integer.toString(Octal,2);
	System.out.println("Resultado: "+ Binary);


}
}