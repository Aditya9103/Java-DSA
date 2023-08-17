package javaDSA.STRING;

public class String_Compare_Function {
    
    public static void main(String[] args) {
        String S1="Tony";
        //String S2= "Tony";
        String S3= new String("Tony");
        // if (S1== S2){
        //     System.out.println("String are equal");
        // }
        // else{
        //     System.out.println("String are not equal");
        // }
        // if (S1== S3){
        //     System.out.println("String are equal");
        // }
        // else{
        //     System.out.println("String are not equal");
        // }

        if (S1.equals(S3)){
            System.out.println("String are equal");

        }
        else{
            System.out.println("String are not equal");
        }
    }
    
}
