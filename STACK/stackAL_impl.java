package javaDSA.STACK;

import java.util.ArrayList;

public class stackAL_impl {
    static class stack{
        static ArrayList<Integer> l1=new ArrayList<>();
        public static boolean isempty(){
            return l1.size() ==0;
        }  
        public static void  push(int data){
            l1.add(data);
        }
        public static int  pop(){
            if(isempty()){
                return -1;
            }
            int top =l1.get(l1.size()-1);
            l1.remove(l1.size()-1);
            return top;
        }
        public static int peek(){
            if ( isempty()){
                return -1;
            }
            return l1.get(l1.size()-1);
        }  
    }
    public static void main(String[] args) {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();

        while (!stack.isempty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }   

    // public static void main(String[] args) {
    //     stack s1=new stack();

    //     s1.push(1);
    //     s1.push(2);
    //     s1.push(3);

    //    while (!s1.isempty()){
    //     System.out.println(s1.peek());
    //     s1.pop();
    //    }

    // }

    
}
