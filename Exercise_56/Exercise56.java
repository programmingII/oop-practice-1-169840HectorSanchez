/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/25/2019
*  Hora: 11:10
*  Wtd: Write a Java program to find the number of integers within the range of *  two specified numbers and that are divisible by another number. 
*/
import java.util.Scanner;
public class Exercise56{
	public static void main(String[] args){
	Scanner Sr = new Scanner(System.in);
	//Crea objeto scanner 
		//guardara lo Requerido 
	System.out.println("Ingresa el primer numero: ");
	int x=Sr.nextInt();
	System.out.println("Ingresa el segundo numero: ");
	int y=Sr.nextInt();
	System.out.println("Ingresa el tercer numero: ");
	int z=Sr.nextInt();
	int count=0;
//Se pone el contador a 0 para que cuente las veces que ocurra la ocurrencia
	for(int i=x;i<y;i++){
	//Cuando sea divisible dara residuo de 0
	if(i%z==0){
	count++;
}
}
System.out.println("Resultado: "+count);
	
}
}