package Queue;

public class Queue {
    protected  int[] data;
    private static final int DEFAULT_SIZE=10;

    int end=0;

    public Queue() {
        this(DEFAULT_SIZE);

    }

    public Queue(int size) {
        this.data=new int[size];
    }

    public boolean insert(int item){
        if(isFull())
        {
            System.out.println("queue is full");
            return false;
        }
        data[end++]=item;
        return true;
    }

    public boolean isFull() {
        return end== data.length;
    }

    public boolean isEmpty()
    {
        return end==0;
    }
    public int remove() throws Exception {
        if(isEmpty())
        {
            throw  new Exception("queue is empty");
        }
        int removed=data[0];
        for (int i = 1; i <end ; i++) {
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+" -> ");
        }
    }

}
