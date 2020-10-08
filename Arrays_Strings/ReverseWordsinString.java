import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsinString {
	public static void main(String[] args) {		
		String s= "The moon is white";
		System.out.println(reverseWords(s));
		//Using collections
		System.out.println(reverseWords1(s));	
	}
	private static String reverseWords(String s) {
		String rev = "";
		String[] temp = s.split(" ");
		for (int i = 0; i < temp.length; i++) {
			if (i == temp.length - 1) 
				rev = temp[i] + rev;
			  else
				rev = " " + temp[i] + rev;}
		rev = rev.trim();
		return rev.replaceAll("( )+", " ");
	}
	//Using collections
	private static String reverseWords1(String s) {
		s=s.trim();
		List<String> wordList = Arrays.asList(s.split("\\s+"));
		Collections.reverse(wordList);
		return String.join(" ", wordList);	
	}
}
