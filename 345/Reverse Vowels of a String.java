
// Best solution using two pointers
public class Solution {
public String reverseVowels(String s) {
    if(s == null || s.length()==0) return s;
    String vowels = "aeiouAEIOU";
    char[] chars = s.toCharArray();
    int start = 0;
    int end = s.length()-1;
    while(start<end){
//         This is key! Using while loop until find chars containing "aeiou"
        while(start<end && !vowels.contains(chars[start]+"")){
            start++;
        }
        
        while(start<end && !vowels.contains(chars[end]+"")){
            end--;
        }
        
        char temp = chars[start];
        chars[start] = chars[end];
        chars[end] = temp;
        
        start++;
        end--;
    }
    return new String(chars);
}
        
        
        
// My solutions:
public class Solution {
    public String reverseVowels(String s) {
        
        List<Integer> listpos = new ArrayList<Integer>();
        List<Character> listvow = new ArrayList<Character>();
        
        char[] sarray = s.toCharArray();
        
        for (int i=0; i<s.length();i++) {
             if("aeiouAEIOU".indexOf(s.charAt(i))!=-1) {
                 listpos.add(i);
                 listvow.add(s.charAt(i));
             }
        }
        
        Collections.reverse(listvow);
        // System.out.println(listpos);
        // System.out.println(listvow);
        
        for (int j=0; j<listpos.size();j++) {
            sarray[listpos.get(j)] = listvow.get(j);
        }
        
        return new String(sarray);
    }
}    
    
    

