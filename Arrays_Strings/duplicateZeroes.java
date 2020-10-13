import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class duplicateZeroes {
	public static void main(String[] args) {
		int[] arr= {1,0,2,3,0,4,5,0};
		duplicateZeroes(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void duplicateZeroes(int[] arr) {
		  List list = new ArrayList();
	        for(int i=0;i<arr.length;i++){
	            if(arr[i]==0){
	                list.add(0);
	                list.add(0);
	            }else
	            list.add(arr[i]);
	        }
	    
	        for(int i=0;i<arr.length;i++){
	            arr[i]= (int) list.get(i);
	        }
	}
}
