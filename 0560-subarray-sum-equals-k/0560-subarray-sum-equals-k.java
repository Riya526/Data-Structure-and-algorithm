class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> f=new HashMap<>();
        int sum=0;
        f.put(0,1);
        int res=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int ques=sum-k;
            if(f.containsKey(ques)){
                res+=f.get(ques);
            }
            f.put(sum,f.getOrDefault(sum,0)+1);
        }
        return res;
    }
}