class Solution {
    public int majorityElement(int[] nums) {
        int count=0,can=0;
        for(int num: nums){
            if(count==0){
            can=num;
            }
            if(num==can){
                count++;
            }
            else{
                count--;
            }

        }
        return can;
        
    }
}