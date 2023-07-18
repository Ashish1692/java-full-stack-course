package workjavapkg;


class Mother {
	int age = 44;
	
	void education() {
		System.out.println("fashion Technology");
	}

}

public class Daughter extends Mother {
	int age = 20;
	
	void education() {
		System.out.println("Aeronautical Technology");
	}
	
	public static void main(String[] args) {
		Mother m = new Mother();
		Daughter d = new Daughter();
		Mother m1 = new Daughter();
		
		
		m.education();
		d.education();
		m1.education();
		
		System.out.println(m.age+" "+d.age+" "+" "+m1.age);
	}
}