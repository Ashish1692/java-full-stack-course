package workjavapkg;
import java.util.Hashtable;


public class HashTableClass {

	public static void main(String[] args) {
		Hashtable<String, String> h = new Hashtable<String, String>();
		h.put("name","ashish");
		System.out.println(h.get("name"));
		boolean k = h.containsKey("name");
		System.out.println(k);
		java.util.Date d = new java.util.Date();
		System.out.println(d.getTime());

	}
}
