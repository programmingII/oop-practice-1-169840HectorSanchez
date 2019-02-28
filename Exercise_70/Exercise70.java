/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/28/2019
*  Hora: 00:50
*  Wtd: . Write a Java program to create a string in the form short_string + *  long_string + short_string from two strings. The strings must not have the same *  length.
*/
import java.util.Scanner; //Libreria Scanner 
public class Exercise70{
	public static void main(String[] args){
	Scanner Sr = new Scanner(System.in);
	//Crea objeto scanner 
		//guardara lo Requerido 
	System.out.println("Ingresa la frase: ");
	String frase1 = Sr.nextLine();//Recibe y guarda en frase la nextline.
	System.out.println("Ingresa la otra frase: ");
	String frase2 = Sr.nextLine();//Recibe y guarda en frase la nextline.
/*length()
Returns the length of this string. The length is equal to the number of Unicode code units in the string.*/
//Como es short, long, short. Supondremos que frase1 debe ser menor
	if(frase1.length()<=frase2.length()){
	System.out.println(frase1+frase2+frase1);
}
	else{
	System.out.println(frase2+frase1+frase2);
}
}
}