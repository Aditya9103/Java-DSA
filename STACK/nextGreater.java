package javaDSA.STACK;

import java.util.Stack;


public class nextGreater {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,2,4};
        Stack <Integer> s = new Stack<>();
        int nxtGtr [] = new int [arr.length];
        
        for(int i = arr.length-1; i >= 0; i--){
            //1  while
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }

            // 2 if else
            if (s.isEmpty()){
                nxtGtr[i] = -1;
            }else{
                nxtGtr[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for(int i= 0; i< nxtGtr.length; i++){
            System.out.print(nxtGtr[i]+" ");
        }
        System.out.println();
    }
    
}

