/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/23/2019
*  Hora: 20:59
*  Wtd: Write a Java program to compute the distance between two points on the surface of earth. 
*/
import java.util.Scanner;
import java.lang.Math;
//The class Math contains methods for performing basic numeric operationsa
class Exercise36{
	public static void main(String[] args){
	Scanner Sr = new Scanner(System.in);
	//Crea objeto scanner 
		//guardara lo Requerido 

	System.out.println("Ingresa el valor de la latitud 1: ");
		Double a = Sr.nextDouble(); //Variable de la latitud 1
	System.out.println("Ingresa el valor de la longitud 1: ");
		Double b = Sr.nextDouble(); //Variable de la longitud 1

	System.out.println("Ingresa el valor de la latitud 2: ");
		Double c = Sr.nextDouble(); //Variable de la latitud 2
	System.out.println("Ingresa el valor de la longitud 1: ");
		Double d = Sr.nextDouble(); //Variable de la longitud 2

	Double r=6371.01;
//Se debe convertir a radianes
// La formula lo requiere
/*Let phi_1,lambda_1 and phi_2,lambda_2 be the lat and long in radians of 2 points */
	a=Math.toRadians(a);
	b=Math.toRadians(b);
	c=Math.toRadians(c);
	d=Math.toRadians(d);
	
	Double Distance=(r*Math.acos(Math.sin(a)*Math.sin(c)+Math.cos(a)*Math.cos(c)*Math.cos(b-d)));

	System.out.print("La distancia entre los dos puntos es: "+Distance+" km");
}
}