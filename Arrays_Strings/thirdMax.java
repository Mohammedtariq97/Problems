import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class thirdMax {

	public static void main(String[] args) {
		int[] nums = {4, 3, 2, 1};
		System.out.println(thirdMax(nums));
	}
	public static int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        if(set.size()<3){
            return Collections.max(set);
        }
            set.remove(Collections.max(set));
            set.remove(Collections.max(set));
            return Collections.max(set); 
    }
}
