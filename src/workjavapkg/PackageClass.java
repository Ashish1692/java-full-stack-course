package workjavapkg;

public class PackageClass {
	protected void add(int x) {
		x++;
		System.out.println(x);
	}
	public void sub(int x) {
		x--;
		System.out.println(x);
	}

	public static void main(String[] args) {
		System.out.println("workpackage.packageclass.main called");
		PackageClass obj = new PackageClass();
		obj.add(4);
	}
}