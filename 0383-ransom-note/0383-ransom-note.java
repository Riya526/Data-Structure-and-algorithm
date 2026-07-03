class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n=ransomNote.length();
        int m=magazine.length();
        HashMap<Character,Integer> r=new HashMap<>();
        HashMap<Character,Integer> mg=new HashMap<>();
        for(int i=0;i<n;i++){
            r.put(ransomNote.charAt(i),r.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        for(int i=0;i<m;i++){
            mg.put(magazine.charAt(i),mg.getOrDefault(magazine.charAt(i),0)+1);
        }
        for(char ch:r.keySet()){
            if(!mg.containsKey(ch)||r.get(ch)>mg.get(ch)){
                return false;
            }
        }
        return true;

    }
}