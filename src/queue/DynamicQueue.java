package queue;


public class DynamicQueue extends Queue {
    public DynamicQueue(){
        super();
    }
    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean enqueue(int value) throws Exception {
        if(isFull()){
            int[] temp = new int[data.length * 2];
            for(int i = 0 ; i < data.length ; i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.enqueue(value);
    }
}
