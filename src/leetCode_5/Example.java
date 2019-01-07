package leetCode_5;

public class Example {


    private int beginIndex=0;

    private int endIndex=0;


    public String longestPalindrome(String s) {
        if(s==null||s.equals("")) {
            return "";
        }
        char[] chars= s.toCharArray();
        for (int i=0;i<chars.length;i++) {
            checkPalindromic(chars, i);
            if (chars.length > i + 1 && chars[i] == chars[i + 1]) {
                checkPalindromic(chars, i, i + 1);
            }
        }
        return s.substring(beginIndex,endIndex+1);
    }


    private void checkPalindromic(char[] chars,int index) {
        int beginIndex=index;
        int endIndex=index;
        checkPalindromic(chars,index,index);
    }

    private void checkPalindromic(char[] chars,int beginIndex,int endIndex) {
        while(beginIndex>0&&endIndex<chars.length-1&&chars[beginIndex-1]==chars[endIndex+1]) {
            beginIndex--;
            endIndex++;
        }
        int length=endIndex-beginIndex+1;
        if(length>=(this.endIndex-this.beginIndex+1)) {
            this.beginIndex = beginIndex;
            this.endIndex = endIndex;
        }
    }
}
