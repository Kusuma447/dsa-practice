import java.util.HashMap;
class MaxFreq{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2,4,5,2};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
     for(int key:map.keySet()){
        System.out.println(key+"->"+map.get(key));
     }


    }
}