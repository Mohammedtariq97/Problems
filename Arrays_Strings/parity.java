import java.util.Arrays;

public class parity {

	public static void main(String[] args) {
			int [] A = {3,1,2,4};
			System.out.println(Arrays.toString(sortArrayByParity(A)));

	}
	public static int[] sortArrayByParity(int[] A) {
	        int j=0;
	        for(int i=0;i<A.length;i++){
	            if(A[i]%2 == 0){
	                int temp= A[j];
	                A[j]=A[i];
	                A[i]=temp;
	                j++;
	            }
	        }
	        return A;
	}
}

