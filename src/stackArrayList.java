import java.util.ArrayList;

public class stackArrayList {
    static class stack{
        ArrayList<Integer> list=new ArrayList<>();
        public boolean isEmpty()
        {
           return list.size()==0;
        }
        public void push(int value)
        {

            list.add(value);
        }
        public int pop(){
            if(list.isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public int peek(){
            return list.get(list.size()-1);
        }


    }

    public static void main(String[] args) {
        stack s=new stack();
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
