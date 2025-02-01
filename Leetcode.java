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

class Solution {
    public boolean isBoomerang(int[][] points) {
        int x1=points[0][0],y1=points[0][1];
        int x2=points[1][0],y2=points[1][1];
        int x3=points[2][0],y3=points[2][1];
        if((x1==x2 && y1==y2) || (x2==x3 && y2==y3) || (x3==x1 && y3==y1)){
            return false;
        }
        return (x2-x1)*(y3-y1)!=(y2-y1)*(x3-x1);
    }
}

class Solution {
    public int removePalindromeSub(String s) {
        int acount=0;
        int bcount=0;
         String reversed = new StringBuilder(s).reverse().toString();
    if(s.equals(reversed)){
        return 1;
    }
       return 2;  
    }
}