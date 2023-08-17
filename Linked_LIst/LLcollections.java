package javaDSA.Linked_LIst;
import java.util.LinkedList;
public class LLcollections {
    public static void main(String[] args) {
        //create
        LinkedList<Integer> l1=new LinkedList<>();
        l1.addLast(2);
        l1.addLast(3);
        l1.addFirst(1);
        System.out.println(l1);
        l1.remove();
        
        System.out.println(l1);
    }
    
}
