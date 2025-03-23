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
public class CombateTest extends TestCase{
    
    public CombateTest() {
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
     * Test of toString method, of class Combate.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Combate instance = new Combate(new Personatge(), new Personatge(), new Personatge());
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, "");
    }

    /**
     * Test of setPer1 method, of class Combate.
     */
    @Test
    public void testSetPer1() {
        Personatge i = new Personatge();
        System.out.println("setPer1");
        Personatge per1 = i;
        Combate instance = new Combate(i, i, i);
        instance.setPer1(per1);
    }

    /**
     * Test of setPer2 method, of class Combate.
     */
    @Test
    public void testSetPer2() {
        Personatge i = new Personatge();
        System.out.println("setPer2");
        Personatge per2 = i;
        Combate instance = new Combate(i, i, i);
        instance.setPer2(per2);
    }

    /**
     * Test of setGuanyador method, of class Combate.
     */
    @Test
    public void testSetGuanyador() {
        Personatge i = new Personatge();
        System.out.println("setGuanyador");
        Personatge Guanyador = i;
        Combate instance = new Combate(i, i, i);
        instance.setGuanyador(Guanyador);
    }

    /**
     * Test of getPer1 method, of class Combate.
     */
    @Test
    public void testGetPer1() {
        Personatge i = new Personatge();
        System.out.println("getPer1");
        Combate instance = new Combate(i, i, i);
        Personatge expResult = i;
        Personatge result = instance.getPer1();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPer2 method, of class Combate.
     */
    @Test
    public void testGetPer2() {
        Personatge i = new Personatge();
        System.out.println("getPer2");
        Combate instance = new Combate(i, i, i);
        Personatge expResult = i;
        Personatge result = instance.getPer2();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGuanyador method, of class Combate.
     */
    @Test
    public void testGetGuanyador() {
        Personatge i = new Personatge();
        System.out.println("getGuanyador");
        Combate instance = new Combate(i, i, i);
        Personatge expResult = i;
        Personatge result = instance.getGuanyador();
        assertEquals(expResult, result);
    }
    
}
