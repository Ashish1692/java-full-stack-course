package workjavapkg;

public class UserDefineException extends Exception{
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
