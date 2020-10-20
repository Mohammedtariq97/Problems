import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class findNumbers {
	public static void main(String[] args) {
		int[] nums= {1,5,10};
		System.out.println(findDisappearedNumbers1(nums));
		System.out.println(findDisappearedNumbers(nums));
	}
	
	 public static List<Integer> findDisappearedNumbers(int[] nums) {
	        List list = new ArrayList();
	        Arrays.sort(nums);
	        for(int i=0;i<nums.length-1;i++){
	            if((nums[i+1]-nums[i]!=1) && (nums[i+1]-nums[i]!=0)){
	                int start= nums[i];
	                int end = nums[i+1];
	                int val = end- start;
	                for(int j=1;j<val;j++) {
	                	int res =start+j;
	                	list.add(res);
	                }
	            }
	        }
	        return list;
	    }
	 
	 //using Hashmap
	 public static List<Integer> findDisappearedNumbers1(int[] nums){
		Map<Integer,Boolean> map = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i], true);
		}
		Arrays.sort(nums);
		int k = nums.length-1;
		int max= nums[k];
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=max;i++) {
			if(!map.containsKey(i)) {
				list.add(i);
			}
		}
		return list;
	 }
}
