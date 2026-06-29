class Demo{
    public int remove(int[] nums){
        int l=0;
        int r=l+1;
        for(r=1;r<nums.length-1;r++){
            if(nums[r]!=nums[l]){ 
                l++;
                nums[l]=nums[r];
        }
        
    }
    return l+1;
}
}
class Two{
    public static void main(String[] args) {
        int[] nums={1,1,2,3,4};
        Demo d=new Demo();
        int result=d.remove(nums);
        System.out.println(result);
    }
}