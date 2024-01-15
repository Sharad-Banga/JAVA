import java.util.Arrays;

public class FindingDuplicateInArray {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{-2,-3,4,-1,-2,-1,5,-3};
        if(containsDuplicate(nums)){
            System.out.println("Duplicate Found");
        }else{
            System.out.println("duplicate not found");
        }
    }
}