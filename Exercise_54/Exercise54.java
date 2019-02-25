/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/25/2019
*  Hora: 10:24
*  Wtd: Write a Java program that accepts three integers from the user and return *  true if two or more of them (integers ) have the same rightmost digit. The *  integers are non-negative.
*/
import java.util.Scanner;
public class Exercise54{
	public static void main(String[] args){
	        Scanner Sr = new Scanner(System.in);
        	System.out.print("Ingresa el primer numero : ");
        	int x = Sr.nextInt();  
		System.out.print("Ingresa el segundo numero: ");
		int y = Sr.nextInt(); 
		System.out.print("Ingresa el tercer numero:");
        	int z = Sr.nextInt(); 
		if((x%10==y%10)||(x%10==z%10)||(z%10==y%10)){
	System.out.println("Verdadero");
	}
	else{
	System.out.println("Falso");
	}
}
}