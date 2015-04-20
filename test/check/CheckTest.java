/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check;

import java.time.LocalDate;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @Scott Purcell
 */
public class CheckTest {
    
    public CheckTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of toSList method, of class Check.
     */
    @Test
    public void testToSList() {
        System.out.println("toSList");
        Check instance = null;
        String expResult = "";
        String result = instance.toSList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Check.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Check instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ischeckedout method, of class Check.
     */
    @Test
    public void testIscheckedout() {
        System.out.println("ischeckedout");
        int item = 0;
        Check instance = null;
        boolean expResult = false;
        boolean result = instance.ischeckedout(item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getpatroncard method, of class Check.
     */
    @Test
    public void testGetpatroncard() {
        System.out.println("getpatroncard");
        Check instance = null;
        int expResult = 0;
        int result = instance.getpatroncard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ispatron method, of class Check.
     */
    @Test
    public void testIspatron() {
        System.out.println("ispatron");
        int c = 0;
        Check instance = null;
        boolean expResult = false;
        boolean result = instance.ispatron(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getbookid method, of class Check.
     */
    @Test
    public void testGetbookid() {
        System.out.println("getbookid");
        Check instance = null;
        int expResult = 0;
        int result = instance.getbookid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of overdue method, of class Check.
     */
    @Test
    public void testOverdue() {
        System.out.println("overdue");
        LocalDate now = null;
        Check instance = null;
        boolean expResult = false;
        boolean result = instance.overdue(now);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
