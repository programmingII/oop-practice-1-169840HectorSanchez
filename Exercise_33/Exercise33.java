/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/23/2019
*  Hora: 20:11
*  Wtd: Write a Java program and compute the sum of the digits of an integer 
*/
import java.util.Scanner;
class Exercise33{
	public static void main(String[] args){
	int x; //Variable donde se guardara el valor del numero
	Scanner Sr = new Scanner(System.in);
	//Crea objeto scanner 
		//guardara lo Requerido 

	System.out.println("Ingrese el valor del numero que desea sumar: ");
	x=Sr.nextInt();
	
	int saver=0;
	while(x!=0){
	saver = saver + (x%10);
	x = x/10;
	}
	System.out.println("Resultado: "+saver);
}
}
