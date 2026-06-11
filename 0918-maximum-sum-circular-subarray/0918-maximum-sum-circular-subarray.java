class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxend=nums[0];
        int maxsum=nums[0];
        int minend=nums[0];
        int minsum=nums[0];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            maxend=Math.max(maxend+nums[i],nums[i]);
            maxsum=Math.max(maxsum,maxend);

            minend=Math.min(minend+nums[i],nums[i]);
            minsum=Math.min(minsum,minend);

            sum+=nums[i];

        }
        if(maxsum<0){
            return maxsum;
        }
        return Math.max(maxsum,sum-minsum);
    }
}