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
public class EstadistiquesPerTest extends TestCase{
    
    public EstadistiquesPerTest() {
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
     * Test of toString method, of class EstadistiquesPer.
     */
    @Test
    public void testToString() {
        EstadistiquesPer i = new EstadistiquesPer();
        System.out.println("toString");
        EstadistiquesPer instance = i;
        String expResult = "";
        String result = instance.toString();
        assertEquals("", "");
    }

    /**
     * Test of getPS method, of class EstadistiquesPer.
     */
    @Test
    public void testGetPS() {
        EstadistiquesPer i = new EstadistiquesPer();
        System.out.println("getPS");
        EstadistiquesPer instance = i;
        int expResult = 0;
        int result = instance.getPS();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPD method, of class EstadistiquesPer.
     */
    @Test
    public void testGetPD() {
        EstadistiquesPer i = new EstadistiquesPer();
        System.out.println("getPD");
        EstadistiquesPer instance = i;
        int expResult = 0;
        int result = instance.getPD();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPA method, of class EstadistiquesPer.
     */
    @Test
    public void testGetPA() {
        EstadistiquesPer i = new EstadistiquesPer();
        System.out.println("getPA");
        EstadistiquesPer instance = i;
        int expResult = 0;
        int result = instance.getPA();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPE method, of class EstadistiquesPer.
     */
    @Test
    public void testGetPE() {
        EstadistiquesPer i = new EstadistiquesPer();
        System.out.println("getPE");
        EstadistiquesPer instance = i;
        int expResult = 0;
        int result = instance.getPE();
        assertEquals(expResult, result);
    }

    /**
     * Test of restarVida method, of class EstadistiquesPer.
     */
    @Test
    public void testRestarVida() {
        EstadistiquesPer i = new EstadistiquesPer();
        System.out.println("restarVida");
        int PS = 0;
        EstadistiquesPer instance = i;
        instance.restarVida(PS);
    }

    /**
     * Test of restauraVida method, of class EstadistiquesPer.
     */
    @Test
    public void testRestauraVida() {
        EstadistiquesPer i = new EstadistiquesPer();
        System.out.println("restauraVida");
        EstadistiquesPer instance = i;
        instance.restauraVida();
    }

    /**
     * Test of setPD method, of class EstadistiquesPer.
     */
    @Test
    public void testSetPD() {
        EstadistiquesPer i = new EstadistiquesPer();
        System.out.println("setPD");
        int PD = 0;
        EstadistiquesPer instance = i;
        instance.setPD(PD);
    }

    /**
     * Test of setPA method, of class EstadistiquesPer.
     */
    @Test
    public void testSetPA() {
        EstadistiquesPer i = new EstadistiquesPer();
        System.out.println("setPA");
        int PA = 0;
        EstadistiquesPer instance = i;
        instance.setPA(PA);
    }

    /**
     * Test of setPE method, of class EstadistiquesPer.
     */
    @Test
    public void testSetPE() {
        EstadistiquesPer i = new EstadistiquesPer();
        System.out.println("setPE");
        int PE = 0;
        EstadistiquesPer instance = i;
        instance.setPE(PE);
    }

    /**
     * Test of actualitzarEstadistiquesPer method, of class EstadistiquesPer.
     */
    @Test
    public void testActualitzarEstadistiquesPer() {
        
        System.out.println("actualitzarEstadistiquesPer");
        Personatge per = new Personatge("", 0, 0, 0, 0, 0, "", new Arma("", 0, 0));
        Arma ar = new Arma("", 0, 0);
        EstadistiquesPer i = new EstadistiquesPer();
        i.actualitzarEstadistiquesPer(per, ar);
    }
}
