import java.util.NoSuchElementException;

public class Queue {

    protected int[] arr = new int[0];
    protected int front, rear, size, len;

    public Queue()
    {
        size = 5;
        len = 0;
        arr = new int[5];
        front = 0;
        rear =  0;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public int getFront() {
        return arr[0];
    }

    public int[] dequeue() {
        if( isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        len-- ;

        for (int i = 0; i < front - 1; i++)
        {
            arr[i] = arr[i + 1];
        }
        return arr;
    }

    public void enqueue(int data) {
        if(rear + 1 >= size)
            throw new IndexOutOfBoundsException("Overflow Exception");
        if(rear + 1 < size )
            arr[++rear] = data;
        len++ ;
    }

}
