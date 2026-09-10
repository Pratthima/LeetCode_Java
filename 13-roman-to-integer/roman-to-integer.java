class Solution {
    public int romanToInt(String s) {
        int total=0,n=s.length();
        Map<Character,Integer>map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

         for(int i=0;i<n;i++){
            int val=map.get(s.charAt(i));
            if(i<n-1 && val<map.get(s.charAt(i+1))){
                total-=val;
            }
            else
            total+=val;
         }
         return total;
        
    }
}