/* Hashset problem
  * Duplicate exists or not 
  * #217 leetcode
 */

import java.util.HashSet;
class Duplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]))
                return true;
            
                set.add(nums[i]);
        
    }
    return false;
}
public static void main(String[] args){
    int[] arr={1,2,3,1};
    Duplicate d=new Duplicate();
    boolean result=d.containsDuplicate(arr);
    System.out.println(result);
}
}