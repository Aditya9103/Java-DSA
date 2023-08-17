package javaDSA.ARRAY;

public class Kadans {
    public static void kadans(int numbers[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i= 0; i<numbers.length; i++){
            if (cs<0){
                cs=0;
            }
            cs+=numbers[i];
            if (cs>ms){
                ms=cs;
            }

        }
        System.out.println("maximum subarry sum is :"+ms);
    }
    public static void main(String args[]){
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        kadans(numbers);

    }
    
}
