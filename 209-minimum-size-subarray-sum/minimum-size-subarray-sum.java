class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int min=Integer.MAX_VALUE;
        int cur=0;
        for(int i=0;i<nums.length;i++){
            cur=cur+nums[i];
            while(cur>=target){
                min=Math.min(min,i-left+1);
                cur=cur-nums[left];
                left++;

            }
          
        }
        return (min==Integer.MAX_VALUE)?0:min;
        
    }
}