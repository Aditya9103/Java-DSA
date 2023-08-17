package javaDSA.BitManipulation.Operation;

public class Update_Ith_Bit {
    public static int Clearithbit(int n ,int i){
        int bitMask=~(1<<i);
        return (n & bitMask);
    }
    public static int Setithbit(int n, int i){
        int bitMask=1<<i;
        return (n|bitMask);
    }
    public static int Updateithbit(int n ,int i, int newBit){
        // if (newBit== 0){
        //     return Clearithbit(n,i);
        // }else{
        //     return Setithbit(n,i);
        // }
        n =Clearithbit(n,i);
        int bitMask=newBit<<i;
        return n|bitMask;
    }
    public static void main (String args[]){
        System.out.println(Updateithbit(10,2,5));
    }
    
}
