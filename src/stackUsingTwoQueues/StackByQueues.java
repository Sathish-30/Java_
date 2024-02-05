import java.util.*;

public class StackByQueues{
    public Queue<Integer> q1 = new LinkedList<>();
    public Queue<Integer> q2 = new LinkedList<>();
    public void add(int val){
        q2.add(val);
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.remove();
        }
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;  
    }
    public int top(){
        if(q1.isEmpty()) return -1;
        while(q1.size() != 1){
            q2.add(q1.peek());
            q1.remove();
        }
        int temp = q1.peek();
        q1.remove();
        q2.add(temp);
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
        return temp;
    }
    public void pop(){
        if(q1.isEmpty()) return;
        while(q1.size() != 1){
            q2.add(q1.peek());
            q1.remove();
        }
        q1.remove();
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }
}