
public class removeElement {

	public static void main(String[] args) {
		int [] nums = {0,1,2,2,3,0,4,2};
		int val =2;
		int len = remove(nums, val);
		for(int i=0;i<len;i++) {
			System.out.println(nums[i]);
		}
	}
	private static int remove(int[] nums, int val) {
		int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
	}
}
