import java.util.Scanner;

public class ReverseWords {
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		String s = "My name is Tariq";	
		System.out.println(reverseWords(s));
		input.close();
	}
	private static String reverseWords(String s) {
		String c= "";
		 String[] temp = s.split(" ");
		 for(int i=0;i<temp.length;i++) {
			 StringBuffer sb= new StringBuffer(temp[i]); 
			 sb.reverse();
			 if(i==0) c= c + sb.toString();
			 else	 c= c +" "+sb.toString();
		 } 
		return c;
	}
}
