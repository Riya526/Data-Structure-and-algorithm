class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        int length=0;
        boolean odd=false;
        for(char ch:freq.keySet()){
            int count=freq.get(ch);
            if(count%2==0){
                length+=count;
            }else{
                length+=count-1;
                odd=true;
            }
        }
        if(odd){
            length++;
        }
        return length;
    }
}