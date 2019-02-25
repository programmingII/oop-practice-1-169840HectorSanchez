/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/24/2019
*  Hora: 18:59
*  Wtd: Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
*/
import java.util.Scanner;
public class Exercise44 {
  public static void main(String[] args) {
	Scanner Sr = new Scanner(System.in);
	//Crea objeto scanner 
		//guardara lo Requerido 
System.out.println("Ingrese el numero que hara la ecuacion: ");
	int x=Sr.nextInt();
	System.out.println("La ecuacion "+x+" + "+x+x+" + "+x+x+x);
	System.out.println("Resultado: "+(x+(11*x)+(111*x)));
	
	
  }
}
