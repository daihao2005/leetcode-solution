import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    public static void main(String[] args) {
        Problem1 p = new Problem1();
        int[] ints = p.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(ints);
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int a = target - nums[i];
            if (map.containsKey(a)) {
                Integer aIndex = map.get(a);
                return new int[]{aIndex, i};
            } else {
                map.put(nums[i], i);
            }
        }
        return nums;
    }
}
