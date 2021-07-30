package week14;

public class Queue {
    private int capacity;
    int queueArray[];
    int front = 0;
    int rear = -1;
    int currentSize = 0;

    public Queue()
    {

    }

    public boolean isQueueFull(){
        boolean status = false;
        if (currentSize == capacity){
            status = true;
        }
        return status;
    }

    public boolean isQueueEmpty(){
        boolean status = false;
        if (currentSize == 0){
            status = true;
        }
        return status;
    }


    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow!");
        }
        else {
            rear++;
            if(rear == capacity-1){
                rear = 0;
            }
            queueArray[rear] = item;
            currentSize++;
            System.out.println("Element enqueued ");
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow!");
        } else {
            front++;
            if(front == capacity-1){
                front = 0;
            } else {
                System.out.println("Element dequeued");
            }
            currentSize--;
        }
    }

}
