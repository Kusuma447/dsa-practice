public class MinNum {
    public static void main(String[] args){
        int[] arr={10,20,30,100,101,20};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
    
}
