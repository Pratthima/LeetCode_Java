class Solution {
    static void reverse(int[] nums,int left,int right){
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
    public boolean check(int[] nums) {
        int[] org=nums.clone();
        Arrays.sort(nums);
        if(Arrays.equals(org,nums))
        return true;
        
        for(int i=1;i<=nums.length;i++){
            reverse(nums,0,i-1);
            reverse(nums,i,nums.length-1);
            reverse(nums,0,nums.length-1);
            if(Arrays.equals(org,nums)){
            return true;
            }
            Arrays.sort(nums);
        }
        
        return false;
    }
}