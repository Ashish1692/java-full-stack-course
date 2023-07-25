package workjavapkg;

public class ExceptionHandlin2 {

	public static void main(String[] args) {
		try {
			String s1 = args[0];
			String s2 = args[1];
			int a=Integer.parseInt(s1);
			int b = Integer.parseInt(s2);
			System.out.println(a/b);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("please enter two values "+e);
		}catch(ArithmeticException e2) {
			System.out.println("2nd number should be greter than 0");
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("j");
		}
	}

}
