public class Solution {
    public int lengthOfLastWord(String s) {
        
        if (s.length() == 1 && s.charAt(0) != ' ') return 1;
        int j = 0;
        
        outloop:
        for (int i=s.length()-1; i>=1; i--) {
            if (s.charAt(i) != ' ') {
                j++;
                if (s.charAt(i-1) == ' ') break outloop;
            }
            if (i==1 && s.charAt(0) != ' ') j++;
            
        }
        
        return j;
    }
}
