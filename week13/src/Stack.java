
import java.util.NoSuchElementException;

/**
 *
 * @author Josiah Murray
 */

public class Stack {

    protected int arr[];
    protected int top, size, len;

    /*  Constructor for arrayStack */
    public Stack()
    {
        size = 5;
        len = 0;
        arr = new int[5];
        top = -1;
    }

    /*  Method to check if stack is empty */
    public boolean isEmpty()
    {
        return top == -1;
    }

    /*  Method to check if stack is full */
    public boolean isFull()
    {
        return top == size -1 ;
    }

    /*  Method to get the size of the stack */
    public int getSize()
    {
        return len ;
    }

    /*  Method to check the top element of the stack */
    public int peek()
    {
        if( isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        return arr[top];
    }

    /*  Method to add an element to the stack */
    public void push(int i)
    {
        if(top + 1 >= size)
            throw new IndexOutOfBoundsException("Overflow Exception");
        if(top + 1 < size )
            arr[++top] = i;
        len++ ;
    }

    /*  Method to delete an element from the stack */
    public int pop()
    {
        if( isEmpty() )
            throw new NoSuchElementException("Underflow Exception");
        len-- ;
        return arr[top--];
    }

    /*  Method to display the status of the stack */
    public void display()
    {
        System.out.print("\nStack = ");
        if (len == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        for (int i = top; i >= 0; i--)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}


class StackImplement
{
    public static void main(String[] args)
    {
        Stack s = new Stack();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.display();
        s.pop();
        System.out.print("After the pop operation");
        s.display();

    }

}
