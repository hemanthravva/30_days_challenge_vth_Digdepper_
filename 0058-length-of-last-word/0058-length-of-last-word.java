class Solution {
    public int lengthOfLastWord(String s) {
     String[] words=s.trim().split(" ");
     String lastwords=words[words.length -1];
     int size = lastwords.length();
     return size;
    }
}