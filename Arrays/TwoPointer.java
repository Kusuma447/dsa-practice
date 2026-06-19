public class TwoPointer{
public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int t=50;
      int sum=0;
      int left=0;
      int right=arr.length-1;
      while(left<right){
           sum=arr[left]+arr[right];
            if(sum==t){
                System.out.println("found"+ sum  );
                break;
            }
      
         if(sum<t){
            left++;
         }
         else{
            right--;
         }

      }
   }
      
   }
  

        
    

