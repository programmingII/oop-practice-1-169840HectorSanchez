/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/24/2019
*  Hora: 20:38
*  Wtd: Write a Java program to print numbers between 1 to 100 which are divisible *  by 3, 5 and by both.
*/

public class Exercise50 {
  public static void main(String[] args) { 
	System.out.println("Divididos entre 3: ");		
		for (int i=0;i<100;i++) {
			if (i%3==0) 
			System.out.print (i +", ");			
		}
System.out.println("\n Divididos entre 5: ");		
		for (int i=0;i<100;i++) {
			if (i%5==0) 
			System.out.print (i +", ");			
		}	
System.out.println("\n Divididos entre 3 y 5: ");		
		for (int i=0;i<100;i++) {
			if ((i%3==0) && (i%5==0)) 
			System.out.print (i +", ");			
		}		

  }
}