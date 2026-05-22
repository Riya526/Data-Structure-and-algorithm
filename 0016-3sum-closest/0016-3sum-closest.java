class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n =nums.length;
        Arrays.sort(nums);
        int max_diff=Integer.MAX_VALUE;
        int result_sum=0;
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            
            while(left<right){
                int sum=nums[left]+nums[right]+nums[i];
                int diff=Math.abs(sum-target);
                if(max_diff>diff){
                    max_diff=diff;
                    result_sum=sum;
                }
                if(sum==target){
                    left++;
                    right--;
                    
                }else if(sum<target){
                    left++;
                }else{
                    right--;
                }
                
                
            }
        }
        return result_sum;
    }
}