class SlidingWindow{
    public static void main(String[] args){
        int[] arr={1,2,11,4,5,6,7,8};
        int k=3;
        int windowSum=0;
        int maxSum=0;

        for(int i=0;i<k;i++){
            windowSum+=arr[i];

        }
        maxSum=windowSum;
        for(int i=k;i<arr.length;i++){
            windowSum=windowSum-arr[i-k]+arr[i];
            if(windowSum>maxSum){
                maxSum=windowSum;
            }
        }
        System.out.println(maxSum);
    }
}