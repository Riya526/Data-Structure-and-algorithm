class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()||t.length()==0){
            return "";
        }
        int[] freq=new int[128];
        for(char c:t.toCharArray()){
            freq[c]++;
        }
        int low=0,high=0,start=0;
        int req=t.length();
        int minlen=Integer.MAX_VALUE;
        for(high=0;high<s.length();high++){
            char h=s.charAt(high);
            if(freq[h]>0){
                req--;
            }
            freq[h]--;
            while(req==0){
                if(high-low+1<minlen){
                minlen=high-low+1;
                start=low;
                }
                char l=s.charAt(low);
                freq[l]++;
                if(freq[l]>0){
                    req++;
                }
                low++;
            }
        }
        if(minlen==Integer.MAX_VALUE){
            return "";
        }else{
            return s.substring(start,start+minlen);
        }
    }
}