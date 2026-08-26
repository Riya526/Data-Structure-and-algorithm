class Solution {
    public int fib(int n) {
        HashMap<Integer,Integer> dp=new HashMap<>();
        if(n==0||n==1){
            return n;
        }
        if(dp.containsKey(n)){
            return dp.get(n);
        }
        int a1=fib(n-1);
        int a2=fib(n-2);
        int ans=a1+a2;
        dp.put(n,ans);
        return ans;
    }
}