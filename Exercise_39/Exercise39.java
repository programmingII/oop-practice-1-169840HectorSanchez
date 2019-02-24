/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/24/2019
*  Hora: 13:53
*  Wtd: Write a Java program to create and display unique three-digit number using *  1, 2, 3, 4. Also count how many three-digit numbers are there.
*/
/*SUM No es util. Son combinaciones de 3 para cuatro. No repeticiones. Usar contador para contar cuantas son.  Iteracion?*/
//Ideas:
//123
//124

public class Exercise39{
    
 public static void main(String[] args){
		int contador = 0;
//Va a iterar todas las posibilidades

		for(int i=1;i<=4;i++){
		for(int j=1;j<=4;j++){
		for(int l=1;l<=4;l++){
			
			if(l!=i && l!=j && i!=j){
			contador++;
//El contador se encuentra adentro porque contara solo las combinaciones
//Si fueran permutaciones se encontraria afuera del if
//Como son combinaciones no pueden repetirse
			System.out.println(i + "" + j + "" + l);
					}
				}
			}
		}
//Si hubieran sido permutaciones serian: 64
//Debe de dar 24
		System.out.println("Total: "+contador);
	}
}