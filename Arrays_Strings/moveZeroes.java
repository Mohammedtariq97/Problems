import java.util.Arrays;
public class moveZeroes {
	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 3, 12 };
		int lastNonZeroFoundAt = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[lastNonZeroFoundAt] = nums[i];
				lastNonZeroFoundAt++;
			}
		}
		for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
			nums[i] = 0;
		}
		System.out.println(Arrays.toString(nums));
		// using additional space
		int k = 0;
		int[] res = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				res[k] = nums[i];
				k++;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = res[i];
		}
		System.out.println(Arrays.toString(nums));
	}
}
