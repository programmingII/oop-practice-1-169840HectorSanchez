/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/28/2019
*  Hora: 00:00
*  Wtd: Write a Java program to calculate the modules of two numbers without using *  any inbuilt modulus operator. 
*/
import java.util.Scanner; //Libreria Scanner 
public class Exercise65{
	public static void main(String[] args){
	Scanner Sr = new Scanner(System.in);
	//Crea objeto scanner 
		//guardara lo Requerido 
	System.out.println("Ingresa el valor para modular: ");
//Muestra lo que le pide al user 
	int x= Sr.nextInt();
	System.out.println("Ingresa el valor para modular: ");
//Muestra lo que le pide al user 
	int y= Sr.nextInt();
//Formula a mod b = a-b(a/y);
	int div = (x/y);
	int altmod = ((x)-(y*div));
System.out.println(altmod);
	
}
}