package workjavapkg;

//nested classes

public class Outer {
	int a = 19;
	void calllinear() {
		Inner i = new Inner();
		i.display();
	}

	class Inner{
		void display() {
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		
		Outer outerObject = new Outer();
//      Outer.Inner innerObject = outerObject.new Inner();
//		innerObject.display();
		
        outerObject.calllinear();
		
	}

}
