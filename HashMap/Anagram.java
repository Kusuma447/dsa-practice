import java.util.HashMap;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Integer>n=new HashMap<>();
        for(char c:s.toCharArray()){
            n.put(c,n.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
             if(!n.containsKey(c)||n.get(c)==0){
                return false;
             }
             n.put(c,n.get(c)-1);
        }
        return true;
    }
}
class Anagram{
    public static void main(String[] args) {
        String s1="anagram";
        String t1="nagarams";
        Solution s=new Solution();
        Boolean b=s.isAnagram(s1,t1);
        System.out.println(b);
        
    }
}