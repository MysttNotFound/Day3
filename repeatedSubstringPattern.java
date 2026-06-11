/*
Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.
*/

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for(int i=1;i<=s.length()/2;i++){
            if(s.length()%i!=0){
                continue;
            }
                boolean found = true;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)!=s.charAt(j%i)){
                    found=false;
                    break;
                }
               
            }
            if(found){
                return true;
            }
        }
        return false;
    }
}