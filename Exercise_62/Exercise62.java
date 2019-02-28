/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/27/2019
*  Hora: 16:38
*  Wtd: Write a Java program that accepts three integer values and return true if *  one of them is 20 or more and less than the substractions of others. 
*/
import java.util.Scanner; //Libreria Scanner 
import java.lang.Math;
public class Exercise62{
	public static void main(String[] args){
	Scanner Sr = new Scanner(System.in);
	//Crea objeto scanner 
		//guardara lo Requerido 
	System.out.println("Ingresa el primer numero: ");//Muestra lo que le pide al user 
	int x = Sr.nextInt();
	System.out.println("Ingresa el segundo numero: ");//Muestra para ingresar el sig num 
	int y = Sr.nextInt();
	System.out.println("Ingresa el tercer numero: ");//Muestra lo que le pide al user 
	int z = Sr.nextInt();
/*Regresara verdadero solamente cuando uno de ellos sea igual o mayor que 20
  Y menor que la substraccion que los otros.*/
	if((x>=20)||(y>=20)||(z>=20)){
		if(Math.abs(x-y)<20||Math.abs(y-z)<20||Math.abs(z-x)<20){
	System.out.println("Verdadero");
	
}
else{
System.out.println("Falso");
}	
}
else{
System.out.println("Falso");
}	
}
}