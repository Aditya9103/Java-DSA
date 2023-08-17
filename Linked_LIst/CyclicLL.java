package javaDSA.Linked_LIst;

public class CyclicLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node Head;
    public static Node Tail;

    public static boolean isCycle(){
        Node slow=Head;
        Node fast=Head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                return true;
            }
        }
        return false;

    }
    public void addfrist(int data){
        Node newNode=new Node(data);
        if (Head==null){
            Head=Tail=null;
        }
        newNode.next=Head;
        Head=newNode;        

    }
    public static  void print(){
        Node temp=Head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        if (Head==null){
            System.out.println("linklist is empyt");
        }
    }
    public static  void removeCycle(){
        Node slow=Head;
        Node fast=Head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            System.out.println("LL is not cycle");
            return;
        }
        // find meetting point

        slow=Head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            fast=fast.next;
            slow=slow.next;
        }
        prev.next=null;

    }

    public static void main(String[] args) {
        
        Head=new Node(1);
        Node temp=new Node(2);
        Head.next=temp;
        Head.next.next=new Node(3);
        Head.next.next.next=temp;

        System.out.println(isCycle());
        //print();
        removeCycle();
        print();
        System.out.println(isCycle());

    }
    
}
