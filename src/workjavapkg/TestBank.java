package workjavapkg;

interface Bank{
	float rateOfInterest();
	int openAccount();
	
}

class SBI implements Bank{
	@Override
	public float rateOfInterest()	{
		return 8.5f;
	}
	public int openAccount() {
		return 5000;
	}
}
class ICICI implements Bank{
	@Override
	public float rateOfInterest() {
		return 9.5f;
	}
	public int openAccount() {
		return 5000;
	}
}


public class TestBank {
	public static void main(String[] args) {
		Bank b = new SBI();
		
		System.out.println("ROI: " + b.rateOfInterest()+"\n"+b.openAccount());
	}
}
