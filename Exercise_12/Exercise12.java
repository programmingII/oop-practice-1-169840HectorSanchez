/* Nombre: Hector_Gerardo_Sanchez_Quiroga

*  Dia: 02/09/2019

*  Hora: 19:28

*  Wtd: Write a Java program that takes three numbers as input to calculate and print the average of the numbers.*/

import java.util.Scanner;

public class Exercise12{
	public static void main(String args[]){
		float a,b,c;
		Scanner Sr = new Scanner(System.in);
		
		System.out.println("Ingrese el primer termino: ");
			a=Sr.nextFloat();
		System.out.println("Ingrese el segundo termino: ");
			b=Sr.nextFloat();
		System.out.println("Ingrese el tercer termino: ");
			c=Sr.nextFloat();
		System.out.println("Resultado = "+((a+b+c)/3));
}
}