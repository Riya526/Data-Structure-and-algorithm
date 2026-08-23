class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> diary=new ArrayList<>();
        fun(s,0,diary,res);
        return res;
    }
    void fun(String s,int idx,List<String> diary,List<List<String>> res){
        if(idx==s.length()){
            res.add(new ArrayList<> (diary));
            return;
        }
        for(int j=idx;j<s.length();j++){
            if(isPalindrome(s,idx,j)){
                diary.add(s.substring(idx,j+1));
                fun(s,j+1,diary,res);
                diary.remove(diary.size()-1);

            }
        }
    }
    boolean isPalindrome(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}