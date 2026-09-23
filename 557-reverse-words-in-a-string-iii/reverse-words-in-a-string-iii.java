class Solution {
    public String reverseWords(String s) {
        String[] word=s.trim().split(" ");
        StringBuilder res=new StringBuilder();
        for(int i=0;i<word.length;i++){
                res.append(new StringBuilder(word[i]).reverse());
            if(i<word.length-1)
            res.append(" ");
        }
        return res.toString();

    }
}