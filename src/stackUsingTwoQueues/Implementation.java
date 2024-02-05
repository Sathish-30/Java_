import java.util.*;

public class Implementation{
    public static void main(String[] args){
        StackByQueues stack = new StackByQueues();
        stack.add(10);
        stack.add(30);
        stack.add(20);
        stack.add(40);
        stack.add(50);
        System.out.println(stack.top());
    }
}