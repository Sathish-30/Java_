package stack;

public class Stack {
    public int[] data;
    private static final int DEFAULT_SIZE = 10;

    private int top = -1;
    public Stack(){
        this(DEFAULT_SIZE);
    }
    public Stack(int size){
        this.data = new int[size];
    }

    public boolean push(int value) throws Exception {
        if(isFull()){
            throw new Exception("Stack is full");
        }else{
            top++;
            data[top] = value;
            return true;
        }
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }else{
            int value = data[top];
            top--;
            return value;
        }
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }else{
            return data[top];
        }
    }

    public void printStack(){
        System.out.println("Elements in stack are : ");
        for(int e : data){
            if(e > 0){
                System.out.println(e);
            }
        }
    }


    public boolean isFull(){
        return top == data.length - 1;
    }

    public boolean isEmpty(){
        return top == - 1;
    }
}
