package javaDSA.STACK;

import java.util.Stack;

public class Histogram {

    public static void maxArea(int arr[]){
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        //next smaller Right
        Stack <Integer> s = new Stack<>();        
        for(int i = arr.length-1; i >= 0; i--){
            //1  while
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }

            // 2 if else
            if (s.isEmpty()){
                nsr[i] = -1;
            }else{
                nsr[i] = arr[s.peek()];
            }
            s.push(i);
        }
        

        // next smallest Left
        Stack <Integer> s1 = new Stack<>();        
        for(int i = 0; i<arr.length; i--){
            //1  while
            while(!s1.isEmpty() && arr[s1.peek()] >= arr[i]){
                s1.pop();
            }

            // 2 if else
            if (s1.isEmpty()){
                nsl[i] = arr.length;
            }else{
                nsl[i] = arr[s1.peek()];
            }
            s1.push(i);
        }

        // current Area width = j-i-1
        for(int i = 0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            
            maxArea = Math.max(maxArea, currArea);

        }
        System.out.println("Max area in histogram is"+maxArea);
    }
    
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,2,3};
        maxArea(arr);
    }
    
}
