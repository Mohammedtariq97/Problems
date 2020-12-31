import java.util.Arrays;

public class medianSortedArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0.00;
        int nums3Length = nums1.length + nums2.length;
        int[] nums3 = new int[nums3Length];
        for(int i=0;i<nums1.length;i++){
            nums3[i]=nums1[i];
        }
        int j=nums1.length;
        for(int i=0;i<nums2.length;i++){
            nums3[j]=nums2[i];
            j++;
        }
        Arrays.sort(nums3);
        if(nums3.length %2 != 0){
            median = nums3[nums3.length/2];
        }else{
            int beforeMid = (nums3.length/2) - 1;
            int afterMid = (nums3.length/2);
            double value = nums3[beforeMid] + nums3[afterMid];
            median = (value) /2;
        }
        return median;
    }
}
