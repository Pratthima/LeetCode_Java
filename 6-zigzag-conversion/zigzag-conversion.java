class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1)
        return s;
        String[] arr=new String[numRows];
        for(int i=0;i<numRows;i++){
            arr[i]="";
        }
        int row=0;
        boolean rows=true;
        for(int i=0;i<s.length();i++){
            arr[row]+=s.charAt(i);
            if(row==numRows-1)
            rows=false;
            else if(row==0)
            rows=true;
            if(rows)
            row++;
            else 
            row--;

        }
        String res="";
        for(int i=0;i<numRows;i++){
            res+=arr[i];
        }
        return res;
        
    }
}