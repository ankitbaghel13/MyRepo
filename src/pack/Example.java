package pack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {

	public static void main(String[] args) {

		/*
		 * Pattern p = Pattern.compile(".s"); Matcher m = p.matcher("as");
		 * boolean b = m.matches();
		 */

		/* boolean b = Pattern.compile(".s").matcher("as").matches(); */

		// boolean b = Pattern.matches(".s", "as");
		/*boolean b = Pattern.matches("[abc]", "b");

		System.out.println(b);*/

		for(int i=1;i<=10;i++){
			System.out.println("hi no - "+i);
		}
		System.out.println("But you didn't reply :(");
	}

}
