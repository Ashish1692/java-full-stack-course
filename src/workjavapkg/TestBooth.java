package workjavapkg;


interface IheritanceInInterface {
	void mul(int a, int y);
}

interface InheritanceInInterface1 extends IheritanceInInterface {
	void div(int x, int y);

}

class TestBooth implements InheritanceInInterface1 {

	public void mul(int a, int y) {
		System.out.println(a * y);
	}

	public void div(int x, int y) {
		System.out.println(x / y);

	}

	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		// start of function

		InheritanceInInterface1 tb = new TestBooth();
		tb.mul(9, 9);
		tb.div(873, 31);

		// end of function

		// ending time
		long end = System.currentTimeMillis();
		System.out.println("Exectution time: " + (end - start) + "ms");

	}

}