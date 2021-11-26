import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem46 {
    public static void main(String[] args) {
        Problem46 problem46 = new Problem46();
        List<List<Integer>> lists = problem46.permute(new int[]{0,1,2,3});
        System.out.println(lists);
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums.length == 1) {
            List<Integer> a = new LinkedList<Integer>();
            a.add(nums[0]);
            result.add(a);
            return result;
        }
        int[] perNums = new int[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            perNums[i - 1] = nums[i];
        }
        int first = nums[0];
        List<List<Integer>> perResult = permute(perNums);
        for (List<Integer> list : perResult) {
            for (int i = 0; i < list.size() + 1; i++) {
                List<Integer> temp = new LinkedList<Integer>(list);
                temp.add(i, first);
                result.add(temp);
            }
        }
        return result;
    }

}
