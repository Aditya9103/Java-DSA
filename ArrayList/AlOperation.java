package javaDSA.ArrayList;
import java.util.ArrayList;
public class AlOperation {
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        //Add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        // Get element
        int element=list.get(1);
        System.out.println(element);

        //Delete
        list.remove(1);
        System.out.println(list);

        //set element
        list.set(2,10);
        System.out.println(list);

        //contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(2));

        //size of Array List
        System.out.println(list.size());
        // print array list
        for(int i=0; i<list.size(); i++){
            System.out.println(i);

        }
        System.out.println();
    }

    
}
