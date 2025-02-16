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


class Solution {
    public int numberOfSteps(int num) {
        int result = 0;
        while(num != 0) {
            if(num%2 == 0) {
                num = num/2;
            } else {
                num = num-1;
            }
            result++;
        }
        return result; 
    }
}

class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count=0;
        for(int i=0;i<startTime.length;i++){
            if(startTime[i]<=queryTime && endTime[i]>=queryTime){
                count++;
            }
        }
        return count;
    }
}

class Solution {
    public int unequalTriplets(int[] nums) {
           // Arrays.sort(nums);
       int count =0;
       for(int i=0; i<nums.length; i++)
       {
         for(int j =i + 1; j<nums.length; j++)
         {
           for(int k= j+1; k<nums.length; k++)
           {
             if(nums[i]!=nums[j] && nums[i]!=nums[k]&& nums[k]!=nums[j])
             {
                count++;
             }
           }
         }
       }
       return count;
    }
}

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int i =0;i<nums.length;i++){

            if(set.contains(nums[i]))
            return true;
            set.add(nums[i]);
        }
        return false;
    }
}
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr==null || arr.length==0){
            return arr;
        }
        //create a sorted array
        int[] sortedArray=Arrays.copyOf(arr,arr.length);
        Arrays.sort(sortedArray);

        //use a map to store ranks
        Map<Integer,Integer> rankMap=new HashMap<>();
        int rank=1;
        for(int num:sortedArray){
            if(!rankMap.containsKey(num)){
                rankMap.put(num,rank);
                rank++;
            }
        }

          // Step 3: Replace the original array elements with their ranks
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }

        return result;
    }
}

class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = 0 ; j < arr.length; j++) {
                if(i != j && arr[i] == 2 * arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
