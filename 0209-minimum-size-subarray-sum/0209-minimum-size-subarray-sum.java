class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low=0,high=0;
        int sum=0;
        int res=Integer.MAX_VALUE;
        while(high<nums.length){
            sum+=nums[high];
            while(sum>=target){
            int cnt=(high-low)+1;
            sum-=nums[low];
            low++;
            res=Math.min(res,cnt);
            }
            high++;
        }
        if(res==Integer.MAX_VALUE){
            return 0;
        }else{
        return res;
        }
    }
}