//Nombre: Hector_Gerardo_Sanchez_Quiroga 
//Día: 15/02/2019
//Hora: 20:32

import java.util.Scanner;
//Importa el metodo scanner de la libreria Util
public class Exercise17{

/*They are access modifiers and help us implement Encapsulation (or information hiding). 
https://stackoverflow.com/questions/1020749/what-are-public-private-and-protected-in-object-oriented-programming*/

//Public: Any class can refer to the field or call the method

	public static void main(String[]args){

/*	Static is a keyword which identifies the class related thing.
	Void:Is used to define the Return Type of the Method. It defines what the method can return. Void means the Method will not return any value.
 	Main is the name of the Method. This Method name is searched by JVM as a starting point for an application with a particular signature only.

Ref: https://javabeginnerstutorial.com/core-java-tutorial/public-static-void-mainstring-args-explanation/
In Java args contains the supplied command-line arguments as an array of String objects.A Java application can accept any number of arguments from the command line. This allows the user to specify configuration information when the application is launched.*/

String x;
String y;
Scanner Sr = new Scanner(System.in);
System.out.println("Ingrese el primer numero binario: ");
	x=Sr.nextLine();
System.out.println("Ingrese el segundo numero binario:");
	y=Sr.nextLine();
System.out.println("Resultado: "+(Integer.toBinaryString(Integer.parseInt(x,2)+Integer.parseInt(y,2))));

//Integer.parseInt: Parses the string argument as a signed integer in the radix specified by the second argument.
/*Parses:Parsing usually applies to text - the act of reading text and converting it into a more useful in-memory format, "understanding" what it means to some extent. https://stackoverflow.com/questions/1788796/what-is-parsing*/
/*Integer.toBinary: Returns a string representation of the integer argument as an unsigned integer in base 2.
https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html*/
}}