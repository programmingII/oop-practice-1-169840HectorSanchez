/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/27/2019
*  Hora: 23:06
*  Wtd: Write a Java program that accepts two integer values from the user and *  return the larger values. However if the two values are the same, return 0 and *  return the smaller value if the two values have the same remainder when divided *  by 6.
*/
import java.util.Scanner; //Libreria Scanner 
public class Exercise63{
	public static void main(String[] args){
	Scanner Sr = new Scanner(System.in);
	//Crea objeto scanner 
		//guardara lo Requerido 
//Se ingresan valores
	System.out.println("Ingresa el primer numero: ");
	int x = Sr.nextInt();
	System.out.println("Ingresa el segundo numero: ");
	int y = Sr.nextInt();
//Se checara si ambos valores son iguales
	if(x==y){
	System.out.println("0");
	
}
else{
	if(x%6==y%6){
	if(x<y){
	System.out.println(x);
	
}
else{
System.out.println(y);
	
}
}
}
}
}