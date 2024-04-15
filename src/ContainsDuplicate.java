import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[] {1,2,3,1}));
        System.out.println(containsDuplicate(new int[] {1,2,3,4}));
        System.out.println(containsDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2}));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        for (Integer i : nums) {
            if (uniqueNums.contains(i)) return true;
            uniqueNums.add(i);
        }
        return false;
    }
}