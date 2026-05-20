class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n==0)
        return 0;
        int k=1;
        int i=0;
        int j=1;
        while(j<n){
            if(nums[j]==nums[j-1]){
                j++;
                continue;
            }else{
                nums[i+1]=nums[j];
                i++;
                k++;
                j++;
            }
        }
        return k;
    }
}