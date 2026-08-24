class Solution {
    public boolean rec(String s, String t, int i ,int j){
        if (i==s.length()){
            return true;
        }
        if (j==t.length()){
            return false;
        }
        if (s.charAt(i)==t.charAt(j)){
            return rec(s, t, i+1, j+1);
        }
        else{
            return rec(s, t, i, j+1);
        }
    }
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        boolean res = rec(s, t, i, j);
        return res;
    }
}