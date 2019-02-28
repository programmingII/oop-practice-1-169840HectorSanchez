/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/28/2019
*  Hora: 01:23
*  Wtd: Write a Java program to reverse a word. 
*/
public class Exercise66{
	public static void main(String[] args){
	int sum=1;
	int count=0;
	int n=0;
	//BUscara hasta obtener 100 numeros primos
	while(count<100){
	n++;
	if(n%2!=0){
	//checa si es un numero par
	if(es_primo(n)){
	sum+=n;
	count++;
	}
		}
}
System.out.println("La sumatoria de los 100 primeros numeros primos fue: "+sum);	
}
public static boolean es_primo(int n){
	for(int i=3;i*i<=n;i+=2){
	//El for solamente esta funcionando en numero impares
	//ej. 3+2=5 5+2=7 7+2=...
	if(n%i==0){
//Si el residuo es 0, por ende es divisible, asi que no es primo
	return false;
}
}
return true;
}


}