package workjavapkg;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {			
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.err.println(a/b);
			
		}catch(Exception e) {
			System.err.println(e);
			
		}finally {
			System.err.println("finally blocked reached.");
		}

	}

}
