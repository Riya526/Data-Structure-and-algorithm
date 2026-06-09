class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low=0,high=0,sum=0;
        int ans=Integer.MAX_VALUE;
        for(high=0;high<nums.length;high++){
            sum+=nums[high];
            while(sum>=target){
                ans=Math.min(ans,high-low+1);
                sum-=nums[low];
                low++;
            }
        }
        if(ans==Integer.MAX_VALUE){
            return 0;
        }
        else{
            return ans;
        }    
    }
}