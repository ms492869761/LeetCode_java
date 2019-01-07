package leetCode_3;

import java.util.HashMap;

public class Example {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0;
        int length=0;
        char[] chars= s.toCharArray();
        HashMap<Character,Integer> hashMap=new HashMap<Character,Integer>();
        int i=0;
        for(char c:chars) {
            end=i+1;
            if(hashMap.containsKey(c)) {
                if(hashMap.get(c)+1>start) {
                    start=hashMap.get(c)+1;
                }
            }
            hashMap.put(c,i);
            int len=end-start;
            length=length>len?length:len;
            i++;
        }
        return length;
    }
}
