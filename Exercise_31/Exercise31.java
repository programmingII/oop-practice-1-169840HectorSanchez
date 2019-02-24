/* Nombre: Hector_Gerardo_Sanchez_Quiroga
*  Dia: 02/23/2019
*  Hora: 19:27
*  Wtd: Write a Java program to check whether Java is installed on your computer. 
*/
public class Exercise31{
	public static void main(String[] args){
	System.out.println("Version: "+System.getProperty("java.version"));
	System.out.println("Runtime Version: "+System.getProperty("java.runtime.version"));
	System.out.println("Java Home: "+System.getProperty("java.home"));
	System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
	System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url")); 
	System.out.println("Java Class Path: "+System.getProperty("java.class.path")); 
/*Use System.getProperty: The Java platform itself uses a Properties object to maintain its own configuration. The System class maintains a Properties object that describes the configuration of the current working environment. 
Ref: https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html*/
}
}


