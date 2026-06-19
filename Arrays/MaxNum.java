public class MaxNum {
    public static void main(String[] args){
        int[] arr={10,20,30,100,101,20};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
    
}
