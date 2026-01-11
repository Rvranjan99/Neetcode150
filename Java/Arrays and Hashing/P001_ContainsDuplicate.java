import java.util.HashSet;

public class P001_ContainsDuplicate {
    public boolean hasDuplicate(int[] nums){
        HashSet<Integer> seen = new HashSet<>();
        for(int num: nums){
            if(!seen.add(num)) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 6};
        int[] nums2 = {1, 2, 3, 6};
        P001_ContainsDuplicate containsDuplicate = new P001_ContainsDuplicate();
        System.out.println(containsDuplicate.hasDuplicate(nums1));
        System.out.println(containsDuplicate.hasDuplicate(nums2));
    }
    
}