package workjavapkg;

public class ThreadBasic {
	static {
		System.out.println("Static{} -> Current Thread: "+Thread.currentThread().getName());
		System.out.println("Static{} -> Current Thread's Priority: "+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		/**
		 * default thread is main and it is automatically created by jvm 
		 *
		 */
		System.out.println("\nCurrent Thread: "+Thread.currentThread().getName());
		System.out.println("Current Thread's Priority: "+Thread.currentThread().getPriority());

	}

}
