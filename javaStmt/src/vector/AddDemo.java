package vector;

import java.util.Vector;

/**
 * @file AddDemo.java
 * @author USER
 * @date 2016. 3. 15.
 * @story
 * 
 * 
 * 벡터에서 toString 포함됨.
 */
public class AddDemo {
	public static void main(String[] args) {
		Vector<String> vc = new Vector<String>();
		String a = "a", b="b", c="c", d="d";
		vc.add(a);
		vc.add(b);
		vc.add(c);
		vc.add(d);
		
		System.out.println(vc);
		
	}
}
