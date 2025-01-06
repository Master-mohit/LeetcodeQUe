class Solution {
    public int findJudge(int n, int[][] trust) {
        if (trust.length<1 && n==1){
            return 1;
        }
        Map<Integer,Integer>res=new HashMap<>();
        for(int[] t:trust){
            res.put(t[0],res.getOrDefault(t[0],0)-1);
            res.put(t[1],res.getOrDefault(t[1],0)+1);
        }
        for(int i=0;i<n+1;i++){
            if (res.getOrDefault(i,0)==n-1){
                return i;
            }
        }
        return -1;
    }
}

