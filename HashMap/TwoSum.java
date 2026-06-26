/*HashMap Pattern
*leetcode problem Two Sum
*time complexity o(n)
*key insight:for each row check if (target-num)exists  in map
*/

import java.util.HashMap;
class TwoSum{
    public int[] twoSum(int[] nums,int target){
        HashMap<Integer,Integer>map=new HashMap<>();
         for(int i=0;i<nums.length;i++){
            int com=target-nums[i];
            if(map.containsKey(com)){
                return new int[]{
                    map.get(com),i
                };
            }
            map.put(nums[i],i);
         }
         return new int[]{};
    }
    public static void main(String[] args){
        int[] nums={2,7,11,15,16};
        int target=9;
        TwoSum ts=new TwoSum();
        int[] result=ts.twoSum(nums,target);
        System.out.println(result[0]+" "+result[1]);
       
    }
}