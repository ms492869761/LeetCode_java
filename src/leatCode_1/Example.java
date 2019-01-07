package leatCode_1;

import java.util.HashMap;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
public class Example {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> otherIndexMap=new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int num=nums[i];
            if(otherIndexMap.containsKey(num)) {
                return new int[]{otherIndexMap.get(num),i};
            }
            otherIndexMap.put(target-num,i);
        }
        return null;
    }

}
