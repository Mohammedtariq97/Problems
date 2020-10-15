public class duplicateNumbers {

	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,2,3,3,4};
		int len = removeDuplicates(nums);
		for(int i=0;i<len;i++) {
		System.out.println(nums[i]);
		}
	}

	private static int removeDuplicates(int[] nums) {
		 int j;
	     int k=1;
	     for(int i=0;i<nums.length-1;i++){
	         j=i+1;
	         if(nums[i]!=nums[j]){
	             nums[k]=nums[j];
	             k++;
	         } 
	     }
	     return k;
	}
}
