
public class mountainArray {

	public static void main(String[] args) {
		int [] nums = {0,2,3,4,5,2,1,0};	
		System.out.println(validMountainArray(nums));
	}
	public static boolean validMountainArray(int[] A) {
        int i=0;
        int N= A.length;
        while(i+1 < N && A[i]<A[i+1]){
            i++;
        }
        if(i==0 || i==N-1){
            return false;
        }
        while(i+1 < N && A[i]>A[i+1]){
            i++;
        }
        return i==N-1;
    }
}
