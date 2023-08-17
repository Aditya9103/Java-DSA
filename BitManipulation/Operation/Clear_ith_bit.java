package javaDSA.BitManipulation.Operation;

public class Clear_ith_bit {
    public static int Clearithbit(int n ,int i){
        int bitMask=~(1<<i);
        return (n & bitMask);
    }
    public static void main(String args[]){
        System.out.println(Clearithbit(10,1));
    }
    
}
