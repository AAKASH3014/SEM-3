public class ll {
    public Node first = null;

    public class Node{
        int data;
        Node link;

    
        public Node(int data){
            this.data=data;
            this.link=null;

        }
    }


    public void insertAtFirst(int data){
        Node newnode = new Node(data);
        if(first==null){
            first=newnode;
            return;
        }
        
        Node temp=first;

        first=newnode;
        first.link=temp;
    }
    public void display(){
        Node temp=first;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.link;
            
        }
    }
    public static void main(String[] args) {
        ll i1 = new ll();
        i1.insertAtFirst(56);
        i1.insertAtFirst(57);
        i1.insertAtFirst(58);
        i1.insertAtFirst(59);
        i1.display();
    }
}
