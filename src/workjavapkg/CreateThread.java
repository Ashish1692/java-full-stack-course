package workjavapkg;

public class CreateThread extends Thread{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i = 0; i<10;i++) {
			System.out.println("["+Thread.currentThread().getName()+"]= "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {			
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("main() called");
		System.out.println(Thread.currentThread().getName());
		// process 1
		CreateThread t= new CreateThread();
		t.setName("thread 1");
		t.start();
		// process 2
		CreateThread t1= new CreateThread();
		t1.start();
		// process 3
		CreateThread t2 = new CreateThread();
		t2.start();
		
	}

}
