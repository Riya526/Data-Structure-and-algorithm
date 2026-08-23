class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> diary=new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        fun(nums,diary,res,used);
        return res;
    }
    void fun(int[] nums,List<Integer> diary,List<List<Integer>> res,boolean[] used){
        if(diary.size()==nums.length){
            res.add(new ArrayList<>(diary));
            return;
        }
        for(int j=0;j<nums.length;j++){
            if(used[j]){
                continue;
            }
            diary.add(nums[j]);
            used[j]=true;
            fun(nums,diary,res,used);
            diary.remove(diary.size()-1);
            used[j]=false;
        }
    }
}