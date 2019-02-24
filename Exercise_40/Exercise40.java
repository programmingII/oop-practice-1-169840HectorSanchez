/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/23/2019
*  Hora: 22:27
*  Wtd: Write a Java program to list the available character sets in charset objects.
*/
import java.nio.charset.Charset;
/*The class description for java.nio.charset.Charset lists the encodings that any implementation of Java SE 8 is required to support. ref: https://docs.oracle.com/javase/8/docs/technotes/guides/intl/encoding.doc.html*/
public class Exercise40 {
  public static void main(String[] args) {

	System.out.println("Lista de charsets Disponibles: ");  
	/*Availablecharset: Constructs a sorted map from canonical charset names to charset objects.*/
/*Que es charset? A character encoding tells the computer how to interpret raw zeroes and ones into real characters.Como Ascii*/
	for (String CSets : Charset.availableCharsets().keySet()) {
      System.out.println(CSets);
  }
}
}