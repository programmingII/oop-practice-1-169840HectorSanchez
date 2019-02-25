/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/24/2019
*  Hora: 19:47
*  Wtd: Write a Java program to display the system time. 
*/
import java.util.Calendar;
/*Antes era:  java.util.Date nuevo-> java.util.Calendar
The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields*/
public class Exercise46 {
  public static void main(String[] args) { 
	Calendar Momento=Calendar.getInstance();
//Se creo un objeto Calendario llamado momento
/*getInstance() lo que hace es: 
Calendar's getInstance method returns a Calendar object whose calendar fields have been initialized with the current date and time
ref: https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html*/
	System.out.println("La hora es: "+ Momento.getTime());
/*getTime():
Returns a Date object representing this Calendar's time value
Ref: https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html */

  }
}