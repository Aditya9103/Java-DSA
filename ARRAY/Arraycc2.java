package javaDSA.ARRAY;
//import java.util.*;
public class Arraycc2 {
    public static void Update(int marks[],int nonChangable){
        nonChangable =10;
        for (int i= 0; i< marks.length; i++){
            marks[i] = marks[i] + 1;

        }
    }
    public static void main(String args[]){
        int marks[]= {97, 98, 99};
        int nonChangable=5;
        Update(marks,nonChangable);
        System.out.println(nonChangable);

        //Update(marks);

        //print our marks
        for(int i= 0; i< marks.length; i++){
            System.out.print(marks[i]+ " ");

        }
        System.out.println();

    }
    
}
