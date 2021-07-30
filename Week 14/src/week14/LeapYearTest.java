package week14;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    public LeapYearTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testIsLeapYear(){
//        LeapYear instance = new LeapYear();
//        boolean expResult = true;
//        boolean result = instance.isLeapYear(1972);
//        assertEquals(expResult, result);

//        LeapYear instance = new LeapYear();
//        boolean expResult = false;
//        boolean result = instance. isLeapYear(1973);
//        assertEquals(expResult, result);

//        LeapYear instance = new LeapYear();
//        boolean expResult = false;
//        boolean result = instance.isLeapYear(1900);
//        assertEquals(expResult, result);

        LeapYear instance = new LeapYear();
        boolean expResult = true;
        boolean result = instance.isLeapYear(2000);
        assertEquals(expResult, result);

    }

}
