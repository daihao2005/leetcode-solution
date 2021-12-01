import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Problem496 {

    public static void main(String[] args) {
        Problem496 p = new Problem496();
        int[] ints = p.nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4});
        System.out.println(ints);
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> nextMaxMap = new HashMap<>();
        for (int num : nums2) {
            if (stack.size() == 0 || num < stack.peek()) {
                stack.push(num);
            }
            while (stack.size() > 0 && num > stack.peek()) {
                Integer tmp = stack.pop();
                nextMaxMap.put(tmp, num);
            }
            stack.push(num);
        }
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int num = nums1[i];
            result[i] = nextMaxMap.getOrDefault(num, -1);
        }
        return result;
    }
}
