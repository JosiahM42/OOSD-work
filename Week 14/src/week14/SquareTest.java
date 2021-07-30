package week14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    public void testArea() {
        Square instance = new Square(2.0);
        double expResult = 4.0;
        double result = instance.Area();
        assertEquals(expResult, result,0.0);
    }

    @Test
    public void testPerimeter() {
        Square instance = new Square(2.0);
        double expResult = 8.0;
        double result = instance.Perimeter();
        assertEquals(expResult, result,0.0);
    }
}