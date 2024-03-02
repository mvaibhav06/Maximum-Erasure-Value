import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MaxErasure {
    public static int maxUniqueSubArray(int[] nums){

        HashSet<Integer> temp = new HashSet<>();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = 0;

        while (right < nums.length){

            if (!temp.contains(nums[right])){
                temp.add(nums[right]);
                sum += nums[right];
                max = Math.max(sum, max);
                right++;
            }else {
                temp.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {10000,1,10000,1,1,1,1,1,1};
        System.out.println(maxUniqueSubArray(nums));
    }
}
