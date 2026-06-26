/*#1464 leetcode
*max product
*used second largest sum logic
*= in the second block is very imp
 */
class MaxProduct {
    public int max(int[] nums) {
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int x:nums){
            if(x>first){
                second=first;
                first=x;
            }
            else if (x<=first && x>second){
                second=x;
            }
          
        }
        return ((first-1)*(second-1));
        
    }
    public static void main(String[] args){
        int[] nums={1,2,3,4,5,4};
        MaxProduct m=new MaxProduct();
        int result=m.max(nums);
        System.out.println(result);
    }
}