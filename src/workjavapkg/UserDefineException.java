package workjavapkg;

public class UserDefineException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String ex = null;

	public UserDefineException(String myex) {
		// TODO Auto-generated constructor stub
		System.out.println("Object Created for InvalidAgeException");
		this.ex= myex;
	}
	public String toString() {
		return "this is an instance of InvalidAgeException for age: "+this.ex;
	}

}
