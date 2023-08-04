package workjavapkg;
import java.util.Enumeration;
import java.util.Vector;
public class VectorClass {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.addElement("java");
		v.addElement("python");
		System.out.println("capacity: "+v.capacity());
		System.out.println(v);
		System.out.println("size: "+v.size());
//		System.out.println(v.contains("java"));

		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}

}
