class Solution {
    public int characterReplacement(String s, int k) {
        int low=0,high=0,maxfreq=0,ans=0;
        int[] freq=new int[26];
        for(high=0;high<s.length();high++){
            int idx=s.charAt(high)-'A';
            freq[idx]++;
            maxfreq=Math.max(maxfreq,freq[idx]);
            while(high-low+1-maxfreq > k){
                freq[s.charAt(low)-'A']--;
                low++;
            }
            ans=Math.max(ans,high-low+1);
        }
        return ans;
    }
}