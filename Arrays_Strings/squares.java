import java.util.Arrays;

public class squares {

	public static void main(String[] args) {
		int [] nums = {4,-1,0,3,100};		
		System.out.println(Arrays.toString(sortedSquares(nums)));
	}

	private static int[] sortedSquares(int[] A) {
		for(int i=0;i<A.length;i++){
	           A[i]= (int)Math.pow(A[i],2);
	        }
	    for(int i=0;i<A.length;i++){
	       for(int j=i+1;j<A.length;j++){
	            if(A[i]>A[j]){
	                int temp= A[i];
	                A[i]=A[j];
	                A[j]=temp;
	            }
	        }
	    }
		return A;
	}
}
