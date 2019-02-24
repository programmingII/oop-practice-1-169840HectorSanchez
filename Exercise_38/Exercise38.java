/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/23/2019
*  Hora: 21:34
*  Wtd: Write a Java program to count the letters, spaces, numbers and other characters of an input string.
*/
import java.util.Scanner;

class Exercise38{
	public static void main(String[] args){
	
	Scanner Sr = new Scanner(System.in);
	//Crea objeto scanner 
		//guardara lo Requerido 
	System.out.println("Ingresa la frase: ");
	String s=Sr.nextLine(); 
	//Variable donde se guardara el string que haremos las diferentes acciones
	int let=0;
	int space=0;
	int num=0;
	int other=0;
char[] caracter=s.toCharArray();
/*Copies the characters in this instance to a Unicode character array.
ref: https://docs.microsoft.com/en-us/dotnet/api/system.string.tochararray?view=netframework-4.7.2*/
for(int i=0;i<s.length();i++){
/*The java string length() method length of the string. It returns count of total number of characters. The length of java string is same as the unicode code units of the string.Ref: https://www.javatpoint.com/java-string-length*/
if(Character.isLetter(caracter[i])){
	let++;
}
else
if(Character.isDigit(caracter[i])){
	num++;
}
else	
if(Character.isSpaceChar(caracter[i])){
	space++;
}	
else
	other++;

}
System.out.println("Letras: "+let);
System.out.println("Numeros: "+num);
System.out.println("Espacios: "+space);
System.out.println("Otros: "+other);
}
}