/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/25/2019
*  Hora: 10:34
*  Wtd: Write a Java program to convert a string to an integer in Java.
*/
import java.util.Scanner;
public class Exercise55{
	public static void main(String[] args){
	Scanner Sr = new Scanner(System.in);
	//Crea objeto scanner 
		//guardara lo Requerido 
	System.out.println("Ingresa los segundos: ");
	int segundosTotales = Sr.nextInt();
//Calcula los segundos que se veran y luego eliminara esos segundos
	int segundosMostrados= segundosTotales%60;
	segundosTotales -= segundosMostrados;
//Calcula los minutos que se veran y luego eliminara los minutos pero en segundos	
	int minutosTotales = segundosTotales/60;
	int minutosMostrados = minutosTotales%60;
	 minutosTotales -= minutosMostrados;
//Calcula los minutos que se veran y luego eliminara los minutos pero en segundos
	int horasMostrados = minutosTotales/60;
	System.out.println(horasMostrados+"/"+minutosMostrados+"/"+segundosMostrados);
}
}
