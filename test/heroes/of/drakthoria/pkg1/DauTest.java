/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package heroes.of.drakthoria.pkg1;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Manel
 */
public class DauTest extends TestCase{
    
    public DauTest() {
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
     * Test of getCaras method, of class Dau.
     */
    @Test
    public void testGetCaras() {
        System.out.println("getCaras");
        Dau instance = new Dau(0);
        int expResult = 0;
        int result = instance.getCaras();
        assertEquals(expResult, result);
    }

    /**
     * Test of llencar method, of class Dau.
     */
    @Test
    public void testLlencar() {
        System.out.println("llencar");
        Dau instance = new Dau(0);
        int expResult = 0;
        int result = instance.llencar();
        assertEquals(expResult, result);
    }
    
}
