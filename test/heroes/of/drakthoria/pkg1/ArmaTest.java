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
public class ArmaTest extends TestCase{
    
    public ArmaTest() {
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
     * Test of toString method, of class Arma.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Arma instance = new Arma("", 0, 0);
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getArma method, of class Arma.
     */
    @Test
    public void testGetArma() {
        System.out.println("getArma");
        Arma instance = new Arma("", 0, 0);
        String expResult = "";
        String result = instance.getArma();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDanyArma method, of class Arma.
     */
    @Test
    public void testGetDanyArma() {
        System.out.println("getDanyArma");
        Arma instance = new Arma("", 0, 0);
        int expResult = 0;
        int result = instance.getDanyArma();
        assertEquals(expResult, result);
    }

    /**
     * Test of getVelArma method, of class Arma.
     */
    @Test
    public void testGetVelArma() {
        System.out.println("getVelArma");
        Arma instance = new Arma("", 0, 0);
        int expResult = 0;
        int result = instance.getVelArma();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNumArmes method, of class Arma.
     */
    @Test
    public void testGetNumArmes() {
        System.out.println("getNumArmes");
        int expResult = 0;
        int result = 0;
        assertEquals(expResult, result);
    }

    /**
     * Test of setArma method, of class Arma.
     */
    @Test
    public void testSetArma() {
        System.out.println("setArma");
        String i = "";
        Arma instance = new Arma("", 0, 0);
        instance.setArma(i);
    }

    /**
     * Test of setDanyArma method, of class Arma.
     */
    @Test
    public void testSetDanyArma() {
        System.out.println("setDanyArma");
        int i = 0;
        Arma instance = new Arma("", 0, 0);
        instance.setDanyArma(i);
    }

    /**
     * Test of setVelArma method, of class Arma.
     */
    @Test
    public void testSetVelArma() {
        System.out.println("setVelArma");
        int i = 0;
        Arma instance = new Arma("", 0, 0);
        instance.setVelArma(i);
    }
    
}
