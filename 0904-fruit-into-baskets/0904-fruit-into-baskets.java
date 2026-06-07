class Solution {
    public int totalFruit(int[] fruits) {
        
        int n=fruits.length;
        int low=0,maxlen=0,high=0;
        Map<Integer,Integer> freq=new HashMap<>();
        for(high=0;high<n;high++){
            freq.put(fruits[high],freq.getOrDefault(fruits[high],0)+1);
            while(freq.size()>2){
                freq.put(fruits[low],freq.get(fruits[low])-1);
                if(freq.get(fruits[low])==0){
                    freq.remove(fruits[low]);
                }
                low++;
            }
            maxlen=Math.max(maxlen,high-low+1);

        }
        return maxlen;
    }
}