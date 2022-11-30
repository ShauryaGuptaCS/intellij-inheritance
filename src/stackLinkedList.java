public class stackLinkedList {
    static class stackimp{
        class Node
        {
            int data;
            Node next;
            Node(int value){
                this.data=value;
                this.next=null;
            }
        }
        static Node head;
        public boolean isEmpty()
        {
            if(head==null)
            {
                return true;
            }
            return false;
        }
        public void push(int value)
        {
            Node NewNode=new Node(value);
            if(isEmpty())
            {
                head=NewNode;
                return;
            }
            NewNode.next=head;
            head=NewNode;
        }
        public int pop()
        {
            int top=head.data;
            head=head.next;
            return top;
        }
        public int peek()
        {
            return head.data;
        }
    }
    public static void main(String[] args) {
        stackimp s=new stackimp();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
