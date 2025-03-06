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


# Write your MySQL query statement below
SELECT e.name AS Employee
FROM Employee e
INNER JOIN Employee m
    ON e.managerId = m.id
WHERE e.salary > m.salary;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
class Solution {
    public int daysBetweenDates(String date1, String date2) {
        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);

        long daysBetween = Math.abs(ChronoUnit.DAYS.between(d1,d2));
        return (int) daysBetween;
    }
}

import java.util.*;

class Solution {
    public String sortString(String s) {
        StringBuilder sb = new StringBuilder(s);
        HashSet<Character> set = new HashSet<>(); 
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        } 

        char[] arr = new char[set.size()];
        int ind = 0;
        for (char c : set) {
            arr[ind++] = c;
        } 

        Arrays.sort(arr);
        StringBuilder res = new StringBuilder();
        
       
        while (sb.length() > 0) {
            
            for (int i = 0; i < arr.length; i++) {
                if (sb.indexOf(String.valueOf(arr[i])) != -1) { 
                    res.append(arr[i]);
                    int index = sb.indexOf(String.valueOf(arr[i])); 
                    sb.deleteCharAt(index);  
                }
            }

            
            for (int i = arr.length - 1; i >= 0; i--) {
                if (sb.indexOf(String.valueOf(arr[i])) != -1) { 
                    res.append(arr[i]);
                    int index = sb.indexOf(String.valueOf(arr[i])); 
                    sb.deleteCharAt(index); 
                }
            }
        }

        return res.toString();
    }
}

class Solution {
    public int minStartValue(int[] nums) {
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];

        for(int i=1;i<nums.length;i++){
            prefixSum[i] = prefixSum[i-1]+nums[i];
            System.out.println(prefixSum[i]);
        }

        int min = Integer.MAX_VALUE;

        for(int p:prefixSum){
            min = Math.min(min, p);
        }

        return min<0?Math.abs(min)+1:1;
    }
}

class Solution {
    public int minimumOperations(int[] nums) {
        int count1=0,count2=0;
        for(int num:nums){
            if(num%3==1){
                count1++;
            }else if(num%3==2){
                count2++;
            }
        }
        return count1+count2;
    }
}