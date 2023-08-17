package javaDSA.STRING;

public class String_compress_using_SB {
    public static String compression(String str){
        StringBuilder sb=new StringBuilder("");
        String newstr=" ";
        sb.append(newstr);
        for(int i=0; i<str.length(); i++){
            Integer count=1;
            while(i<str.length() -1 && str.charAt(i)== str.charAt(i+1)){
                count++;
                i++;

            }
            if (count>1){
                newstr+=count.toString();
            }
        }
        return newstr;
    }


    public static void main(String[] args) {
        String str= "aaaabbbbbccde";
        System.out.println(compression(str));
        
    }
}
    

