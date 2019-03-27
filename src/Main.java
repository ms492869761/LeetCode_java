import leetCode_7.Example;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<5;i++) {
            stack.push(i);
        }
        while(!stack.empty()){
            System.out.println(stack.pop());
        }

        Example example=new Example();
        int a=example.reverse(-123);
        System.out.println(a);
    }

}
