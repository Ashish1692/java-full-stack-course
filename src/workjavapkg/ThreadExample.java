package workjavapkg;

public class ThreadExample implements Runnable{
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ThreadExample r = new ThreadExample();
		Thread t = new Thread();
		t.start();

	}

	@Override
	public void run() {
		// FIXME Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		
	}

}
