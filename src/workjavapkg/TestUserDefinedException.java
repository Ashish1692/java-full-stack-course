package workjavapkg;

public class TestUserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = Integer.parseInt(args[0]);
		try {
			if(age<19) {
				throw new UserDefineException(args[0]);
			}
		}catch(UserDefineException e) {
			System.out.println(e);
		}
	}

}
