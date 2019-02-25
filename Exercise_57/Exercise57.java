/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/25/2019
*  Hora: 12:20
*  Wtd: Write a Java program to convert a string to an integer in Java.
*/
import java.util.Scanner;
public class Exercise57{
	public static void main(String[] args){
	Scanner Sr = new Scanner(System.in);
	//Crea objeto scanner 
		//guardara lo Requerido 
	System.out.println("Ingresa el numero: ");
	int x = Sr.nextInt();
//Se ingresa el numero que se quiere conocer sus factores
	int count=0;
	for(int i=1;i<=x;i++){
	if(x%i==0){
	//Si un numero tiene un factor entonces cumplira y se le sumara 1.
	count++;
}
}
	System.out.println("El numero de factores es: "+count);	
}
}