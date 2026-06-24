class BinarySearchDemo{
    public static void main(String[] args) {
        int[] arr={1,3,2,4,5,6,7,8};
        int target=6;
        int l=0;
        int r=arr.length-1;
        int mid=0;
        while(l<=r){
             mid=(l+r)/2;
                if(arr[mid]==target){
                    System.out.println("found at"+mid+"="+arr[mid]);
                    break;
                }
                else if(target>arr[mid]){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            
        }
    }
}