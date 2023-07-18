package workjavapkg;

abstract class Abs{
	void give(int a) {
		System.out.println(a);	};
	abstract void give(int x,int y);
	
}

public class Abstraction extends Abs{

	void gives() {
		System.out.println("h");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abs n = new Abstraction();
		n.give(3,5);
	}
	@Override
	void give(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println(x*y);
	}

}
