/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/24/2019
*  Hora: 20:01
*  Wtd: Write a Java program to display the current date time in specific format. 
*/
import java.text.SimpleDateFormat;
/*SimpleDateFormat is a concrete class for formatting and parsing dates in a locale-sensitive manner.Ref: https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html*/
public class Exercise47 {
  public static void main(String[] args) { 
	SimpleDateFormat Momento = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		/*Lo que hace aqui es un nuevo formato: Donde se pone como se require el nuevo Date
Ref: https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html*/
	System.out.println("\nNow: "+Momento.format(System.currentTimeMillis()));
/*currentTimeMillis()
Returns the current time in milliseconds.
ref: https://docs.oracle.com/javase/7/docs/api/java/lang/System.html*/
  }
}