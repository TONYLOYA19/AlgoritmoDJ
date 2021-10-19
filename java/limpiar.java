import java.io.*;
class limpiar { 
 static void cls(){
		try{
		if (System.getProperty("os.name").contains("Windows"))
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		else
		Runtime.getRuntime().exec("clear");
		}catch (IOException  | InterruptedException ex) {}	
		}
}

