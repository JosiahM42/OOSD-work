package week14;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isQueueFull() {
        Queue queue = new Queue();
        boolean expResult = true;
        boolean result = queue.isQueueFull();
        assertEquals(expResult, result);
    }

    @Test
    void isQueueEmpty() {
        Queue queue = new Queue();
        boolean expResult = true;
        boolean result = queue.isQueueEmpty();
        assertEquals(expResult, result);
    }

    @Test
    void enqueue() {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        boolean expResult = true;
        boolean result = queue.isQueueFull();
        assertEquals(expResult, result);
    }

    @Test
    void dequeue() {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.dequeue();
        boolean expResult = true;
        boolean result = queue.isQueueEmpty();
        assertEquals(expResult, result);
    }
}