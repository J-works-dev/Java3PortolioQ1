/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portfolioq1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jeremy
 */
public class CountryNodeTest {
    
    public CountryNodeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of display method, of class CountryNode.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        CountryNode instance = new CountryNode();
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrev method, of class CountryNode.
     */
    @Test
    public void testGetPrev() {
        System.out.println("getPrev");
        CountryNode instance = new CountryNode();
        CountryNode expResult = null;
        CountryNode result = instance.getPrev();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrev method, of class CountryNode.
     */
    @Test
    public void testSetPrev() {
        System.out.println("setPrev");
        CountryNode prev = null;
        CountryNode instance = new CountryNode();
        instance.setPrev(prev);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNext method, of class CountryNode.
     */
    @Test
    public void testGetNext() {
        System.out.println("getNext");
        CountryNode instance = new CountryNode();
        CountryNode expResult = null;
        CountryNode result = instance.getNext();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNext method, of class CountryNode.
     */
    @Test
    public void testSetNext() {
        System.out.println("setNext");
        CountryNode next = null;
        CountryNode instance = new CountryNode();
        instance.setNext(next);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
