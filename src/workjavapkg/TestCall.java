package workjavapkg;

import java.io.IOException;

public class TestCall {
	public static void main(String[] arg) {
		
			try {
				
				@SuppressWarnings({ "deprecation", "unused" })
				Process process = Runtime.getRuntime().exec("calc");
				System.out.println("Worked...");
				
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			
			
			
		
	}
}
