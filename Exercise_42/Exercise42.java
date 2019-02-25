/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/23/2019
*  Hora: 14:28
*  Wtd: Write a Java program to input and display your password.
*/
import java.util.Scanner;
public class Exercise42 {
  public static void main(String[] args) {
	Scanner Sr = new Scanner(System.in);
	//Crea objeto scanner 
		//guardara lo Requerido 
	System.out.println("Ingresa la contraseña: ");
	String x=Sr.nextLine();
	
	System.out.println("Ingresa la contraseña originaria: ");
	String z=Sr.nextLine();
	if(new String(z).equals(x)){
/*equals(Object a,Object b)
Returns true if the arguments are equal to each other and false otherwise.
ref: https://docs.oracle.com/javase/7/docs/api/java/util/Objects.html#equals(java.lang.Object,%20java.lang.Object)*/
	System.out.println("La contraseña fue: "+x);
}else{
	System.out.println("Contraseña Incorrecta");
}
	
  }
}