/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/23/2019
*  Hora: 19:52
*  Wtd: Write a Java program to compare two numbers.
*/
import java.util.Scanner;
public class Exercise32{
	public static void main(String[] args){
	int x;
	int y;
	Scanner Sr = new Scanner(System.in);
/*System.in is an InputStream which is typically connected to keyboard input of console programs. Ref: http://tutorials.jenkov.com/java-io/system-in-out-error.html */
	System.out.println("Ingrese el primer numero: ");
	x=Sr.nextInt();
	System.out.println("Ingrese el siguiente numero: ");
	y=Sr.nextInt();
//Crear diferentes condicionales. Que se activaran si ocurre lo que se pide.

	if(x==y){
		System.out.println(x+" == "+y);
	}
	if(x!=y){
		System.out.println(x+"!="+y);
	}
	if(x<y){
		System.out.println(x+"<"+y);
	}
	if(x>y){
		System.out.println(x+">"+y);
	}
	if(x<=y){
		System.out.println(x+"<="+y);
	}
	if(x>=y){
		System.out.println(x+">="+y);
	}


}
}