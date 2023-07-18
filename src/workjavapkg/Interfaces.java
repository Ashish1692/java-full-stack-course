package workjavapkg;


interface Calculator1{
	
	void add(int a, int b);
	void sub(int a, int b, int c);
};
interface Calculator2{
	
	void mul(int a, int b);
};

public class Interfaces implements Calculator1, Calculator2 {
	
	 public void add(int a, int b){
	      System.out.println(a+b);
	    }
	 public void sub(int a, int b, int c) {
		 System.out.println(a+b+c);
			
		}
	 	 	
	    public static void main(String[] args)
	    {
	        Calculator1 t = new Interfaces();
	        
	        t.add(12,25);
	        t.sub(122, 93, 332);
	        
	        Calculator2 t1= new Interfaces();
	        
	        t1.mul(3, 5);
	       

	    }
		@Override
		public void mul(int a, int b) {
			// TODO Auto-generated method stub
			
		}

		
		
}
