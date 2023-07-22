package workjavapkg;

public class Encapsulation {
	
	private int age;
	private String name;
	
	public Encapsulation(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
				
		Encapsulation obj = new Encapsulation(43,"james");
				
		System.out.println(obj.getAge()+"\n"+obj.getName());

	}


}
