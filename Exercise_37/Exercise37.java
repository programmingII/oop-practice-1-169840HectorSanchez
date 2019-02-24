/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/23/2019
*  Hora: 21:17
*  Wtd: Write a Java program to reverse a string
*/
import java.util.Scanner; 
import java.lang.StringBuilder;
/*StringBuilder objects are like String objects, 
except that they can be modified. 
Internally, these objects are treated like 
variable-length arrays that contain a sequence of characters.
Why use it: https://stackoverflow.com/questions/7569335/reverse-a-string-in-java*/
class Exercise37{
	public static void main(String[] args){
	
	Scanner Sr = new Scanner(System.in);
	//Crea objeto scanner 
		//guardara lo Requerido 
	System.out.println("Ingresa la frase que quieras voltear: ");
	String s=Sr.nextLine(); 
	//Variable donde se guardara el string que lo 	vamos a voltear
	System.out.println(new StringBuilder(s).reverse().toString());
	/*StringBuilder.reverse(): Reverses the sequence of characters in this string builder. ref: https://docs.oracle.com/javase/tutorial/java/data/buffers.html
 https://stackoverflow.com/questions/2441501/reverse-each-individual-word-of-hello-world-string-with-java
*/

}
}