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
public class EstadistiquesFonTest extends TestCase{
    
    public EstadistiquesFonTest() {
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
     * Test of toString method, of class EstadistiquesFon.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        EstadistiquesFon instance = new EstadistiquesFon();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, "");
    }

    /**
     * Test of getNIV method, of class EstadistiquesFon.
     */
    @Test
    public void testGetNIV() {
        System.out.println("getNIV");
        EstadistiquesFon instance = new EstadistiquesFon();
        int expResult = 1;
        int result = instance.getNIV();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPEX method, of class EstadistiquesFon.
     */
    @Test
    public void testGetPEX() {
        System.out.println("getPEX");
        EstadistiquesFon instance = new EstadistiquesFon();
        int expResult = 0;
        int result = instance.getPEX();
        assertEquals(expResult, result);
    }

    /**
     * Test of guanyarPEX method, of class EstadistiquesFon.
     */
    @Test
    public void testGuanyarPEX() {
        System.out.println("guanyarPEX");
        int PEX = 0;
        EstadistiquesFon instance = new EstadistiquesFon();
        instance.guanyarPEX(PEX);
    }
    
}
