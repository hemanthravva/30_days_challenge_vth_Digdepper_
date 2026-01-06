class Solution {
    public String sortSentence(String s) {
        String arr[]=s.split(" ");
        String result[]=new String[arr.length];

        for(int i=0;i<arr.length;i++){

            String word=arr[i];

            int pos=word.charAt(word.length() -1)- '1';

            result[pos]=word.substring(0,word.length() -1);
        }


        return String.join(" ",result);

    }
}