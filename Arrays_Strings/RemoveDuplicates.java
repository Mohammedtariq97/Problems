public class RemoveDuplicates {

	public static void main(String[] args) {
	
		int[] nums = { 0, 1, 1, 2, 3, 4, 4, 3, 7, 7, 5, 6, 6 };
	
		 if (nums.length == 0) {
			 System.out.println("0");
		 }
		    int i = 0;
		    for (int j = 1; j < nums.length; j++) {
		        if (nums[j] != nums[i]) {
		            i++;
		            nums[i] = nums[j];
		        }
		    }
		   
			
			
		}
	
		
	}

