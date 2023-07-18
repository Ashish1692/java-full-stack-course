package workjavapkg;

// abstraction

abstract class Calculator {
	abstract void add(int a, int b, int c);
}

public class MyCalculator extends Calculator {

	void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
//		Calculator c = new Calculator();
//		c.add(2, 4);

		Calculator d = new MyCalculator();
		d.add(5, 4, 8);
		
	}
}
