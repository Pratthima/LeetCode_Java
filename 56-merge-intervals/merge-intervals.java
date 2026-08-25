class Solution {
   void selection(int[][]intervals){
        int size=intervals.length;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(intervals[i][0]>intervals[j][0]){
                    int[]temp=intervals[i];
                    intervals[i]=intervals[j];
                    intervals[j]=temp;
                }
            }
        }
    }
    public int[][] merge(int[][] intervals) {
        selection(intervals);
        List<int[]>list=new ArrayList<>();
        list.add(intervals[0]);
        int ind=0;
        for(int i=1;i<intervals.length;i++){
            if(list.get(ind)[1]>=intervals[i][0])
            list.get(ind)[1]=Math.max(list.get(ind)[1],intervals[i][1]);
            else{
                list.add(intervals[i]);
                ind++;
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}