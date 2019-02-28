/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/27/2019
*  Hora: 23:29
*  Wtd: Write a Java program that accepts two integer values between 25 to 75 and *  return true if there is a common digit in both numbers. 
*/
import java.util.Scanner; //Libreria Scanner 
public class Exercise64{
	public static void main(String[] args){
	Scanner Sr = new Scanner(System.in);
	//Crea objeto scanner 
		//guardara lo Requerido 
	System.out.println("Ingresa el primer valor mayor a 25 y menor a 75: ");
		//Muestra lo que le pide al user 
	int x = Sr.nextInt();
	System.out.println("Ingresa el segundo valor mayor a 25 y menor a 75: ");
		//Muestra lo que le pide al user 
	int y = Sr.nextInt();
	System.out.println("Resultado: "+comun(x,y));
}
public static boolean comun(int a, int b){
	if(a<25 || b>75)
		return false; /*Se sale del area*/
//Aqui obtendra el residuo y lo guardara
	int w=a%10;
	int z=b%10;
//Aqui obtendra la parte decimal y al ser integer, no dara mas 
	a/=10;
	b/=10;
	return(a==b||a==z||w==b||w==z);
}

}