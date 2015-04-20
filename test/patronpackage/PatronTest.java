/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronpackage;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @Scott Purcell
 */
public class PatronTest {
    
    public PatronTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addcard method, of class Patron.
     */
    @Test
    public void testAddcard() {
        System.out.println("addcard");
        int c = 0;
        Patron instance = null;
        instance.addcard(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Patron.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Patron instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancheckout method, of class Patron.
     */
    @Test
    public void testCancheckout() {
        System.out.println("cancheckout");
        Patron instance = null;
        String expResult = "";
        String result = instance.cancheckout();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkout method, of class Patron.
     */
    @Test
    public void testCheckout() {
        System.out.println("checkout");
        Patron instance = null;
        instance.checkout();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkIn method, of class Patron.
     */
    @Test
    public void testCheckIn() {
        System.out.println("checkIn");
        Patron instance = null;
        instance.checkIn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of items method, of class Patron.
     */
    @Test
    public void testItems() {
        System.out.println("items");
        Patron instance = null;
        int expResult = 0;
        int result = instance.items();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ispatron method, of class Patron.
     */
    @Test
    public void testIspatron() {
        System.out.println("ispatron");
        int c = 0;
        Patron instance = null;
        boolean expResult = false;
        boolean result = instance.ispatron(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
