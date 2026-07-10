class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        if(nums[low]==target){
            return low;
        }else{
            if(nums[low]<target)
                return low+1;
            if(nums[low]>target)
                return low;
            }
        return -1;
    }
}