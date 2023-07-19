package workjavapkg;

public class OuterClassStatic {

	static class InnerClassStatic{
		static void add(int a) {
			System.out.println(a+5);
		}
	}
	public static void main(String[] args) {
		OuterClassStatic.InnerClassStatic.add(5);
	}
}
