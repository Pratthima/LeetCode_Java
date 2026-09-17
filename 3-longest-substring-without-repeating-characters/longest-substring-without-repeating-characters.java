class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,maxlen=0;
        Map<Character,Integer>map=new HashMap<>();
        for(int right=0;right<s.length();right++){
            char val=s.charAt(right);
            if(map.containsKey(val)){
                left=Math.max(left,map.get(val)+1);
            }
            map.put(val,right);
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
        
    }
}