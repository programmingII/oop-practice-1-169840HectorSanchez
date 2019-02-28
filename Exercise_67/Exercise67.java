/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/28/2019
*  Hora: 01:36
*  Wtd: Write a Java program to insert a word in the middle of the another string. 
*/
import java.util.Scanner;
public class Exercise67{
	public static void main(String[] args){
	Scanner Sr = new Scanner(System.in);
	//Crea objeto scanner 
		//guardara lo Requerido 
	System.out.println("Ingresa la frase principal: ");
	String frase = Sr.nextLine();//Recibe y guarda en frase la nextline.
	System.out.println("Ingresa la palabra que quieres agregar.: "); 
	String medio = Sr.nextLine();//Recibe y guarda en frase la nextline.
	
	String[] palabras = frase.split(" ");//Separa el string por espacios
	int tam = palabras.length; //tam es igual a la longitud de palabras
	int tamtemp=tam+1;
	String[] output=new String[tamtemp];//Se crea arreglo
 
	for(int i=0;i<tam;i++){
//Pasa las palabras a como se vera cuando ya sea impreso.
	output[i]=palabras[i];
}
	for(int k=tam;k>=tam/2;k--){
//Cuando encuentre la mitad, es cuando pondra "medio"
	if(k!=tam/2){
	output[k]=output[k-1];
}
else{
	output[k]=medio;
}


}
//Imprime la nueva frase
System.out.print("Result: ");
for(int j=0;j<=tam;j++){
System.out.print(output[j]+" ");
}	
}
}