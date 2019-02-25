/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/24/2019
*  Hora: 20:31
*  Wtd: Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd. 
*/
import java.util.Scanner;
public class Exercise49 {
  public static void main(String[] args) { 
	Scanner Sr = new Scanner(System.in);
	//Crea objeto scanner 
		//guardara lo Requerido 
	System.out.println("Ingresa el numero: ");
	int x=Sr.nextInt();
//Un numero par daria un residuo de 0, mientras que uno impar daria residuo //diferente a 00.
	if (x%2==0){
	System.out.println(1);
	}
	else{
	System.out.println(0);
	}

  }
}