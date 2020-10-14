import java.util.Arrays;

public class searching {

	public static void main(String[] args) {
		int [] arr = {-2,0,10,-19,4,6,-8};
		System.out.println(checkIfExist(arr));
	}

	private static boolean checkIfExist(int[] arr) {
		 boolean isPresent = false;
	        Arrays.sort(arr);
	        for(int i=0;i<arr.length-1;i++){
	            for(int j=0;j<arr.length;j++){
	                if((arr[i]*2) ==arr[j] && i!=j){
	                    isPresent = true;
	                }
	            }
	        }
	     return isPresent;
	}
}
