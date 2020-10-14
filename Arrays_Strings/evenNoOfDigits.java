
public class evenNoOfDigits {

	public static void main(String[] args) {
		int [] nums = {437,315,3322,4313,686,264,442};
		System.out.println(findNumbers(nums));
	}

	private static int findNumbers(int[] nums) {
		int value =0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=0){
            nums[i]=nums[i]/10;
            ++value;
            }
            if(value%2==0){
                count++;
            }
            value =0;
        }
        return count;
	}
}
