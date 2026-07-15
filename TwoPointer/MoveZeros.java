/*move zeros -used two pointers */
    class Solution {
    public void moveZeros(int[] nums) {
        int l=0;
     for(int r=0;r<nums.length;r++){ 
            if(nums[r]!=0){
                int temp=nums[l];
               nums[l]=nums[r];
               nums[r]=temp;
               l++;
             
             
            }
            
          
        }
        for(int i=0;i<nums.length;i++){ 
            System.out.println(nums[i]+"");
            }
    }
}
class MoveZeros{
    public static void main(String[] args){
        Solution s=new Solution();
        int[] nums={0,0,2,3,4,0};
        s.moveZeros(nums);
    }
}