/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/25/2019
*  Hora: 8:57
*  Wtd:Write a Java program to calculate the sum of two integers and return true *  if the sum is equal to a third integer.
*/
import java.util.Scanner;
public class Exercise52{
	public static void main(String[] args){
	Scanner Sr = new Scanner(System.in);
		//Crea objeto scanner 
			//guardara lo Requerido 
		System.out.println("Ingresa el primer numero: ");
		int x=Sr.nextInt();
		System.out.println("Ingresa el segundo numero: ");
		int y=Sr.nextInt();
		System.out.println("Ingresa el tercer numero: ");
		int z=Sr.nextInt();
		if((x+y)==z){
		System.out.println("Verdadero");
}
else{
		System.out.println("Falso");
}
}
}