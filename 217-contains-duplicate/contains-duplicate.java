import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;*/
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
        if(set.contains(nums[i])){
        return true;
        }
        set.add(nums[i]);
        }
        return false;
    }
}
