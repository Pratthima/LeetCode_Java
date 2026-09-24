class Solution {
    public int climbStairs(int n) {
        int first=0,sec=1,next=0;
        for(int i=0;i<n;i++){
            next=first+sec;
            first=sec;
            sec=next;
        }
        return next;
        
    }
}