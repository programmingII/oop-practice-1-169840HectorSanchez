/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/23/2019
*  Hora: 20:54
*  Wtd: Write a Java program to compute the area of a polygon.
*/
import java.util.Scanner;
import java.lang.Math;
class Exercise35{
	public static void main(String[] args){
	Double s; //Variable donde se guardara el valor del numero
	int x;//lados del poligono
	Scanner Sr = new Scanner(System.in);
	//Crea objeto scanner 
		//guardara lo Requerido 

	System.out.println("Ingresa el numero de lados del poligono: ");
	x = Sr.nextInt();
	System.out.println("Ingresa el valor de un lado del poligono: ");
	s = Sr.nextDouble();
	Double area = (x*(s*s))/(4*Math.tan(Math.PI/x));
	System.out.println("El area del hexagono es: "+area);

}
}