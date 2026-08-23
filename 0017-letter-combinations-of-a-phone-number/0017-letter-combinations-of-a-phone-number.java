class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        String[] phone={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuilder diary=new StringBuilder();
        fun(digits,0,diary,res,phone);
        return res;
    }
    void fun(String digits,int idx,StringBuilder diary,List<String> res,String[] phone){
        if(idx==digits.length()){
            res.add(diary.toString());
            return;
        }
        String  choice=phone[digits.charAt(idx)-'0'];
        for(int j=0;j<choice.length();j++){
            diary.append(choice.charAt(j));
            fun(digits,idx+1,diary,res,phone);
            diary.deleteCharAt(diary.length()-1);
        }
    }
}