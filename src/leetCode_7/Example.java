package leetCode_7;


public class Example {

    public int reverse(int x) {
        int a=x>=0?1:-1;
        x=x*a;
        int y=0;
        int t=0;
        while(x>0) {
            if(y>Integer.MAX_VALUE/10) {
                return 0;
            }
            y=y*10+x%10;
            x=x/10;
            if(y<0) {
                return 0;
            }
        }
        return y*a;
    }
}
