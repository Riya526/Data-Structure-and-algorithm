class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int low=0;
        int high=k-1;
        int n=nums.length;
        int avg=0;
        for(int i=low;i<=high;i++){
            avg+=(nums[i]);
        }
        int res=Integer.MIN_VALUE;
        while(high<n){
            low++;
            high++;
            res=Math.max(avg,res);
            if(high==n){
                break;
            }
            avg=avg-(nums[low-1]);
            avg=avg+(nums[high]);
        }
        return (double)res/k;
    }
}