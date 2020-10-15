import java.util.Arrays;

public class largestElementOnRight {

	public static void main(String[] args) {
			int [] arr = {17,18,5,4,6,1};
			System.out.println(Arrays.toString(replaceElements(arr)));
	}

	private static int[] replaceElements(int[] arr) {
		 int max=0;
		 int lastIndex= arr.length-1;
		 int condIndex =arr.length-3;
	        for(int i=0;i<arr.length-2;i++){
	        	max=arr[i+1];
	            for(int j=i+1;j<arr.length-1;j++){    
	                if(max<arr[j+1]){
	                    max = arr[j+1];
	                }
	            }
	            arr[i]=max;
	            if(i==condIndex) {
	            	arr[i+1]=arr[lastIndex];
	            }
	        }
	        arr[lastIndex]=-1;
	        return arr;
	}
}
