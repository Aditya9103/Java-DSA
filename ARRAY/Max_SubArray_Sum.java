package javaDSA.ARRAY;

public class Max_SubArray_Sum {

    public static void Max_SubArray_sum(int numbers[]) {
        int currSum=0;
        int maxSum= Integer.MIN_VALUE;

        for (int i=0; i<numbers.length; i++){
            int start =i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum=0;
                for (int k = start; k<=end; k++){
                    // subarry sum
                    currSum+=numbers[k];

                }
                System.out.println(currSum);
                if (maxSum< currSum){
                    maxSum = currSum;

                }
            }
        }
        System.out.println("max sum = "+ maxSum);
    }


    public static void main(String args[]){
        int numbers[]={1,2,3,4,5,6};
        Max_SubArray_sum(numbers);
        

    }
    
}
