/*  Nombre: Hector_Sanchez_169840
*  Dia: 02/07/19
* Hora: 12:46
* @WTD: Write a Java program that takes a number as input and prints its multiplication table upto 10.
*/
import java.util.Scanner;

public class Exercise7{
	public static void main(String args[]){
	
		Scanner Sr = new Scanner(System.in);
		int a;
		
		System.out.println("Ingresa el valor: ");
		a= Sr.nextInt();
//for: Utilizamos el for para realizar una iterracion para mostrar toda la tabla del 10
//i sera el contador del for, y se utilizara el i++ para decir que se sumara i=i+1 por cada iteración
		for(int i=1;i<11;i++){
			System.out.println(a+" X "+i+" = "+(a*i));
}

}
}
