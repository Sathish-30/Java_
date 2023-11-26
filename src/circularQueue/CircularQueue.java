package circularQueue;

public class CircularQueue {
    public int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int front = 0 , end = 0;
    private int size = 0;
    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return size == data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(int value) throws Exception{
        if(isFull()){
            throw new Exception("Circular queue is full");
        }else{
            data[end++] = value;
            end %= data.length;
            size++;
        }
    }

    public int dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("Circular queue is empty");
        }else{
            int removed = data[front++];
            front %= data.length;
            size--;
            return removed;
        }
    }

    public int element() throws Exception{
        if(isEmpty()){
            throw new Exception("Circular queue is Empty");
        }else{
            return data[front];
        }
    }

    public void display(){
        int i = front;
        do{
            System.out.print(data[i++]+" <- ");
            i %= data.length;
        }while(i != end);
        System.out.println("End");
    }

}
