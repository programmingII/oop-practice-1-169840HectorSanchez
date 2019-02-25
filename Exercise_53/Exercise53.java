/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/25/2019
*  Hora: 9:05
*  Wtd: Write a Java program that accepts three integers from the user and return *  true if the second number is greater than first number and third number is *  greater than second number. If "abc" is true second number does not need to be *  greater than first number.
*/
import java.util.Scanner;
public class Exercise53{
	public static void main(String[] args){
	Scanner Sr = new Scanner(System.in);
	//Crea objeto scanner 
		//guardara lo Requerido 
	System.out.println("Ingresa el primer numero: ");
	int x = Sr.nextInt();
	System.out.println("Ingresa el segundo numero: ");
	int y = Sr.nextInt();
	System.out.println("Ingresa el tercer numero: ");
	int z = Sr.nextInt();
//Se obtuvieron los 3 valores x,y,z
	if(z>y){
//Si z>y es verdadero no avanza
	System.out.println("Verdadero");
	}
	else{
if(y>x && z>y){
//Si y>x && z>y es verdadero
	System.out.println("Verdadero");
}
else{
System.out.println("Falso");
}
	}
}
}