package javaDSA.ARRAY;

public class Pairs_In_Array {
    public static void Pairs(int numbers[]){
        int tp=0;
        for(int i=0; i<numbers.length-1 ; i++){
            int current=numbers[i];
            for(int j=i+1; j<numbers.length ; j++){
                System.out.print("("+ current +","+ numbers[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs:"+ tp);
    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5};
        Pairs(numbers);


    }
    
}
