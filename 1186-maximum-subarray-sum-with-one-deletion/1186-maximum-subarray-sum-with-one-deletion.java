class Solution {
    public int maximumSum(int[] arr) {
        int nodel=arr[0];
        int onedel=0;
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            onedel=Math.max(onedel+arr[i],nodel);
            nodel=Math.max(nodel+arr[i],arr[i]);
            ans=Math.max(ans,Math.max(nodel,onedel));
        }
        return ans;
    }
}