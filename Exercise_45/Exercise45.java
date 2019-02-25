/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/24/2019
*  Hora: 19:09
*  Wtd: Write a Java program to find the size of a specified file. 
*/
import java.util.Scanner;
import java.io.File;
/*An abstract representation of file and directory pathnames.
ref: https://docs.oracle.com/javase/7/docs/api/java/io/File.html*/
public class Exercise45 {
  public static void main(String[] args) {
	Scanner Sr = new Scanner(System.in);
	//Crea objeto scanner 
		//guardara lo Requerido 
	System.out.println("Ingrese la direccion del archivo: ");
	String x=Sr.nextLine();
	/*Se debe utilizar length() para el tamaño del archivo
ref: https://docs.oracle.com/javase/7/docs/api/java/io/File.html#length()*/
	System.out.println(x+" " + new File(x).length() + " bytes");
	
  }
}