class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low=0,high=0;
        int sum=0;
        for(int i=low;i<=high;i++){
            sum+=nums[i];
        }
        int res=Integer.MAX_VALUE;
        while(high<nums.length){
            while(sum<target){
            high++;
            if(high==nums.length){
                break;
            }
            sum+=nums[high];
            if(sum==target){
                break;
            }
        }
        while(sum>=target){
            int cnt=(high-low)+1;
            sum-=nums[low];
            low++;
            res=Math.min(res,cnt);
        }
        }if(res==Integer.MAX_VALUE){
            return 0;
        }else{
        return res;
        }
    }
}