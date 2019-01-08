package leetCode_6;

public class Example {



    public String convert(String s, int numRows) {
        if(s==null||s.equals("")||s.length()<=numRows||numRows==1) {
            return s;
        }
        char[] sourceChars=s.toCharArray();
        char[] targetChars=new char[sourceChars.length];
        int group=(numRows-1)*2;
        int groupCount=(int)Math.ceil((double)sourceChars.length/group);
        int targetIndex=0;
        for(int i=0;i<numRows;i++){
            for(int j=0;j<groupCount;j++) {
                int sourceIndex=i+j*group;
                if(sourceIndex<sourceChars.length){
                    targetChars[targetIndex]=sourceChars[sourceIndex];
                    targetIndex++;
                }
                if(i%numRows==0||i%numRows==numRows-1){
                    continue;
                }
                int sourceIndex2=(j+1)*group-i%numRows;
                if(sourceIndex2<sourceChars.length) {
                    targetChars[targetIndex]=sourceChars[sourceIndex2];
                    targetIndex++;
                }
            }
        }
        return new String(targetChars);
    }

}
