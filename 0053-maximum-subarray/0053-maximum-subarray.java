class Solution {
    public int maxSubArray(int[] nums) {
        int best=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int a1=best+nums[i];
            int a2=nums[i];
            best=Math.max(a1,a2);
            ans=Math.max(ans,best);
        }
        return ans;

    }
}