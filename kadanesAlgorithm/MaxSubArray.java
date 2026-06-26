/*kadane's algorithm
*maxsub array leetcode#53 
*/
class MaxSubArray{
    public int max(int[] nums){
        int currentSum=nums[0];
        int maxSum=currentSum;
        for(int i=1;i<nums.length;i++){
            currentSum=Math.max(nums[i],currentSum+nums[i]);
            maxSum=Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        MaxSubArray m=new MaxSubArray();
        int result=m.max(nums);
        System.out.println(result);
    }
}