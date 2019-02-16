/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/15/2019
*  Hora: 21:15
*  Wtd: Write a Java program to multiply two binary numbers.
*/
import java.util.Scanner;
public class Exercise18{
	public static void main(String args[]){
/*Is there a difference between:
public void main(String args[]) { ... } 
and
public void main(String[] args) { ... }*/
/*Semantically, they are identical. However, I'd recommend using the latter syntax (String[] args) when declaring arrays. The former syntax is there mainly for compatibility with C syntax.
Since String[], as a whole, is the type of the object in Java, it's more consistent and clear not to split it up.
Ref: https://stackoverflow.com/questions/5997235/is-there-a-difference-between-mainstring-args-and-mainstring-args*/
	
	String x;
	String y;
	Scanner Sr = new Scanner(System.in);
System.out.println("Ingrese el primer numero binario: ");
	x=Sr.nextLine();
		/*Advances this scanner past the current line and returns the input that was skipped. 
		This method returns the rest of the current line, excluding any line separator at the end. 
		Ref: https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html*/
System.out.println("Ingrese el segundo numero binario:");
	y=Sr.nextLine();
System.out.println("Resultado: "+(Integer.toBinaryString(Integer.parseInt(x,2)*Integer.parseInt(y,2))));
}
}
