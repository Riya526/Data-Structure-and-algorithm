class Solution {
    public int maxProduct(int[] nums) {
        int maxend=nums[0];
        int minend=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int a1=nums[i];
            int a2=maxend*nums[i];
            int a3=minend*nums[i];
            maxend=Math.max(a1,Math.max(a2,a3));
            minend=Math.min(a1,Math.min(a2,a3));
            ans=Math.max(ans,Math.max(maxend,minend));
        }
        return ans;
    }
}