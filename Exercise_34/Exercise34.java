/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/23/2019
*  Hora: 20:42
*  Wtd: Write a Java program to compute the area of a hexagon. 
*/
import java.util.Scanner;
import java.lang.Math;
class Exercise34{
	public static void main(String[] args){
	Double s; //Variable donde se guardara el valor del numero
	Scanner Sr = new Scanner(System.in);
	//Crea objeto scanner 
		//guardara lo Requerido 

	System.out.println("Ingresa el valor del lado del hexagono: ");
	s = Sr.nextDouble();
	Double area = (6*(s*s))/(4*Math.tan(Math.PI/6));
	System.out.println("El area del hexagono es: "+area);

}
}