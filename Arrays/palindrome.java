//leetcode problem 9 easy
class Solution {
    public boolean isPalindrome(int x) {
        String s= String.valueOf(x);                // number we have to convert in string format 
        int n= s.length(); 
        for(int i=0; i<n/2 ; i++){
            if(s.charAt(i)!=s.chartAt(n-1-i)){
                return false;
            }
           

        }
        return true;
        
    }
}
