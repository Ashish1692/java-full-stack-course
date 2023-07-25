package workjavapkg;

public class ThreadBasic {

	public static void main(String[] args) {
		/**
		 * default thread is main and it is automatically created by jvm 
		 *
		 */
		System.out.println("Current Thread: "+Thread.currentThread().getName());
		System.out.println("Current Thread's Priority: "+Thread.currentThread().getPriority());

	}

}
