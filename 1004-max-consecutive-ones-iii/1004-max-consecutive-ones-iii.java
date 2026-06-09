class Solution {
    public int longestOnes(int[] nums, int k) {
        int low=0,high=0,zeros=0,ans=0;
        for(high=0;high<nums.length;high++){
            if(nums[high]==0){
                zeros++;
            }
            while(zeros > k){
                if(nums[low]==0){
                    zeros--;
                }
                low++;
            }
            ans=Math.max(ans,high-low+1);
        }
        return ans;
    }
}