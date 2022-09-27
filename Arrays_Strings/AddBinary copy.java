
public class AddBinary {

	public static void main(String[] args) {		
		String a = "11";
		String b= "1";	
		System.out.println(addBinary(a,b));
	}
	public static String addBinary(String a, String b) {	
		return Integer.toBinaryString(Integer.parseInt(a,2)+Integer.parseInt(b,2));
	}
}
