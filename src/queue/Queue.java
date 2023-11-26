package queue;

public class Queue {
    public int[] data;
    private static final int DEFAULT_SIZE = 10;

    private int end = 0;
    public Queue(){
        this(DEFAULT_SIZE);
    }
    public Queue(int size){
        this.data = new int[size];
    }

    public boolean enqueue(int value) throws Exception{
        if(isFull()){
            throw new Exception("Queue is Full");
        }else{
            data[end++] = value;
            return true;
        }
    }

    public int dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }else{
            int removed = data[0];
            for(int i = 1 ; i < end ; i++){
                data[i - 1] = data[i];
            }
            end--;
            return removed;
        }
    }


    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }else{
            return data[0];
        }
    }

    public void printQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }else{
            System.out.println("Elements in Queue are : ");
            for(int i = 0 ; i < end ; i++){
                System.out.println(data[i]);
            }
        }
    }


    public boolean isFull(){
        return end == data.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }
}
