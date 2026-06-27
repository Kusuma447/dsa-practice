class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
         
                 if(nums[mid]==target){
                     return mid;
                    }
                   else if(target>nums[mid]){
                     left=mid+1;
                     }
                    else{
                     right=mid-1;
                     }
                
        }
     return -1;
    }
    public static void main(String[] args) {
        int[] nums={5};
        int target=5;
        Solution s=new Solution();
        int result=s.search(nums, target);
        System.out.println(result);
    }
}

