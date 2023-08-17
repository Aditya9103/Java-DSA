package javaDSA.Linked_LIst;
public class CreationNode {
    public static class Node{
        int data;
        Node next;
    
        public Node(int data){
            this.data=data;
            this.next= null;
        }
    
    }
    
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        // step 1=create new node
        Node newNode=new Node(data);
        size++;
        if (head ==null){
            head=tail=newNode;
        }
        // step 2 = newNode next-head
        newNode.next=head; //link

        // step 3 head=newNode
        head =newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;

        tail=newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp=head;
        
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        
        }
        System.out.println("null");
    }
    public void addMiddle(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp =head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removeFirst(){
        if (size==0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    int removeLast(){
        if (size==0){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0; i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        //key not found 
        return -1;
    }
    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }
    public void Reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr !=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String args[]){
        CreationNode n1=new CreationNode();
        //n1.print();
        n1.addFirst(2);
        n1.addFirst(1);        
        n1.addLast(5);        
        n1.addLast(7);
        n1.addMiddle(2, 3);        
        n1.addLast(9);
        System.out.println("size="+CreationNode.size);
        n1.print();
        n1.removeFirst();
        n1.removeLast();
       

        n1.print();
        System.out.println("size="+CreationNode.size);
        System.out.println(n1.itrSearch(9));
        System.out.println(n1.recSearch(5));
        n1.Reverse();
    }
}


