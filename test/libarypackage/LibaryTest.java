/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libarypackage;

import book.Book;
import java.io.File;
import java.time.LocalDate;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import patronpackage.Patron;

/**
 *
 * @Scott Purcell
 */
public class LibaryTest {
    
    public LibaryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addbook method, of class Libary.
     */
    @Test
    public void testAddbook() {
        System.out.println("addbook");
        Book b = null;
        Libary instance = new Libary();
        instance.addbook(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPatron method, of class Libary.
     */
    @Test
    public void testAddPatron() {
        System.out.println("addPatron");
        Patron p = null;
        Libary instance = new Libary();
        instance.addPatron(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkout method, of class Libary.
     */
    @Test
    public void testCheckout() {
        System.out.println("checkout");
        int card = 0;
        int item = 0;
        Libary instance = new Libary();
        int expResult = 0;
        int result = instance.checkout(card, item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkin method, of class Libary.
     */
    @Test
    public void testCheckin() {
        System.out.println("checkin");
        int item = 0;
        Libary instance = new Libary();
        boolean expResult = false;
        boolean result = instance.checkin(item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removebook method, of class Libary.
     */
    @Test
    public void testRemovebook() {
        System.out.println("removebook");
        int item = 0;
        Libary instance = new Libary();
        boolean expResult = false;
        boolean result = instance.removebook(item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removepatron method, of class Libary.
     */
    @Test
    public void testRemovepatron() {
        System.out.println("removepatron");
        int card = 0;
        Libary instance = new Libary();
        boolean expResult = false;
        boolean result = instance.removepatron(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of open method, of class Libary.
     */
    @Test
    public void testOpen() throws Exception {
        System.out.println("open");
        File f = null;
        Libary instance = new Libary();
        instance.open(f);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveas method, of class Libary.
     */
    @Test
    public void testSaveas() throws Exception {
        System.out.println("saveas");
        File f = null;
        Libary instance = new Libary();
        instance.saveas(f);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class Libary.
     */
    @Test
    public void testSave() throws Exception {
        System.out.println("save");
        Libary instance = new Libary();
        instance.save();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateDate method, of class Libary.
     */
    @Test
    public void testUpdateDate() {
        System.out.println("updateDate");
        LocalDate d = null;
        Libary instance = new Libary();
        instance.updateDate(d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of allbooks method, of class Libary.
     */
    @Test
    public void testAllbooks() {
        System.out.println("allbooks");
        Libary instance = new Libary();
        String expResult = "";
        String result = instance.allbooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of allpatron method, of class Libary.
     */
    @Test
    public void testAllpatron() {
        System.out.println("allpatron");
        Libary instance = new Libary();
        String expResult = "";
        String result = instance.allpatron();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of allcheckout method, of class Libary.
     */
    @Test
    public void testAllcheckout() {
        System.out.println("allcheckout");
        Libary instance = new Libary();
        String expResult = "";
        String result = instance.allcheckout();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of patronbooks method, of class Libary.
     */
    @Test
    public void testPatronbooks() {
        System.out.println("patronbooks");
        int card = 0;
        Libary instance = new Libary();
        String expResult = "";
        String result = instance.patronbooks(card);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of overduebooks method, of class Libary.
     */
    @Test
    public void testOverduebooks() {
        System.out.println("overduebooks");
        Libary instance = new Libary();
        String expResult = "";
        String result = instance.overduebooks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
