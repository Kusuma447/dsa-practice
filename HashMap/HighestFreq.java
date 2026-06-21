import java.util.HashMap;
public class HighestFreq {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,2,4,5,2};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        int maxFreq=0;
        int result=-1;
        for(int key:map.keySet()){
            if(map.get(key)>maxFreq){
                maxFreq=map.get(key);
                result=key;
            }
          
           
        }
         System.out.println(result +"appears"+maxFreq+"times");


    }
}
