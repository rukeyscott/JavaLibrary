/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 *@Scott Purcell
 */
public class BookTest {
    
    public BookTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addid method, of class Book.
     */
    @Test
    public void testAddid() {
        System.out.println("addid");
        int i = 0;
        Book instance = null;
        instance.addid(i);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cancheckout method, of class Book.
     */
    @Test
    public void testCancheckout() {
        System.out.println("cancheckout");
        String patron = "";
        Book instance = null;
        int expResult = 0;
        int result = instance.cancheckout(patron);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of dayscheckout method, of class Book.
     */
    @Test
    public void testDayscheckout() {
        System.out.println("dayscheckout");
        Book instance = null;
        int expResult = 0;
        int result = instance.dayscheckout();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkout method, of class Book.
     */
    @Test
    public void testCheckout() {
        System.out.println("checkout");
        Book instance = null;
        instance.checkout();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkin method, of class Book.
     */
    @Test
    public void testCheckin() {
        System.out.println("checkin");
        Book instance = null;
        instance.checkin();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of tolist method, of class Book.
     */
    @Test
    public void testTolist() {
        System.out.println("tolist");
        Book instance = null;
        String expResult = "";
        String result = instance.tolist();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Book.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Book instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isBook method, of class Book.
     */
    @Test
    public void testIsBook() {
        System.out.println("isBook");
        int b = 0;
        Book instance = null;
        boolean expResult = false;
        boolean result = instance.isBook(b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
