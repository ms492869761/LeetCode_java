package leetCode_4;

public class Example {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int maxLength=nums1.length+nums2.length;
        int i1=0;
        int i2=0;
        int firstNum=0;
        boolean isTwo=maxLength%2!=0;
        for(int i=1;i<=maxLength;i++) {
            Integer num=null;
            if(nums1.length>i1) {
                num=nums1[i1];
                i1++;
            }
            if(nums2.length>i2) {
                if(num==null) {
                    num=nums2[i2];
                    i2++;
                } else {
                    if(nums2[i2]<num) {
                        num=nums2[i2];
                        i2++;
                        i1--;
                    }
                }
            }
            if(isTwo) {
                if(i==maxLength/2+1) {
                    return num;
                }
            } else {
                if(i==maxLength/2) {
                    firstNum=num;
                }
                if(i==maxLength/2+1) {
                    return ((double)firstNum+num)/2;
                }
            }
        }
        return 0;
    }
}
