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
public class PersonatgeTest extends TestCase{
    
    public PersonatgeTest() {
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
     * Test of toString method, of class Personatge.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Personatge instance = new Personatge();
        String expResult = "";
        String result = "";
        assertEquals(expResult, result);
    }

    /**
     * Test of setArma method, of class Personatge.
     */
    @Test
    public void testSetArma() {
        System.out.println("setArma");
        Arma ar = new Arma("", 0, 0);
        Personatge instance = new Personatge("", 0, 0, 0, 0, 0, "", new Arma("", 0, 0));
        instance.setArma(ar);
    }

    /**
     * Test of getNOM method, of class Personatge.
     */
    @Test
    public void testGetNOM() {
        System.out.println("getNOM");
        Personatge instance = new Personatge("", 0, 0, 0, 0, 0, "", new Arma("", 0, 0));
        String expResult = "";
        String result = instance.getNOM();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFOR method, of class Personatge.
     */
    @Test
    public void testGetFOR() {
        System.out.println("getFOR");
        Personatge instance = new Personatge("", 0, 0, 0, 0, 0, "", new Arma("", 0, 0));
        int expResult = 0;
        int result = instance.getFOR();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCON method, of class Personatge.
     */
    @Test
    public void testGetCON() {
        System.out.println("getCON");
        Personatge instance = new Personatge("", 0, 0, 0, 0, 0, "", new Arma("", 0, 0));
        int expResult = 0;
        int result = instance.getCON();
        assertEquals(expResult, result);
    }

    /**
     * Test of getVEL method, of class Personatge.
     */
    @Test
    public void testGetVEL() {
        System.out.println("getVEL");
        Personatge instance = new Personatge("", 0, 0, 0, 0, 0, "", new Arma("", 0, 0));
        int expResult = 0;
        int result = instance.getVEL();
        assertEquals(expResult, result);
    }

    /**
     * Test of getINT method, of class Personatge.
     */
    @Test
    public void testGetINT() {
        System.out.println("getINT");
        Personatge instance = new Personatge("", 0, 0, 0, 0, 0, "", new Arma("", 0, 0));
        int expResult = 0;
        int result = instance.getINT();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSOR method, of class Personatge.
     */
    @Test
    public void testGetSOR() {
        System.out.println("getSOR");
        Personatge instance = new Personatge("", 0, 0, 0, 0, 0, "", new Arma("", 0, 0));
        int expResult = 0;
        int result = instance.getSOR();
        assertEquals(expResult, result);
    }

    /**
     * Test of getClasse method, of class Personatge.
     */
    @Test
    public void testGetClasse() {
        System.out.println("getClasse");
        Personatge instance = new Personatge("", 0, 0, 0, 0, 0, "", new Arma("", 0, 0));
        String expResult = "";
        String result = instance.getClasse();
        assertEquals(expResult, result);
    }

    /**
     * Test of getArma method, of class Personatge.
     */
    @Test
    public void testGetArma() {
        Arma ar = new Arma("", 0, 0);
        System.out.println("getArma");
        Personatge instance = new Personatge("", 0, 0, 0, 0, 0, "", ar);
        Arma expResult = ar;
        Arma result = instance.getArma();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStatsDerivades method, of class Personatge.
     */
    @Test
    public void testGetStatsDerivades() {
        System.out.println("getStatsDerivades");
        Personatge instance = new Personatge("", 0, 0, 0, 0, 0, "", new Arma("", 0, 0));
        EstadistiquesPer expResult = instance.getStatsDerivades();
        EstadistiquesPer result = instance.getStatsDerivades();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStatsFonamentals method, of class Personatge.
     */
    @Test
    public void testGetStatsFonamentals() {
        System.out.println("getStatsFonamentals");
        Personatge instance = new Personatge("", 0, 0, 0, 0, 0, "", new Arma("", 0, 0));;
        EstadistiquesFon expResult = instance.getStatsFonamentals();
        EstadistiquesFon result = instance.getStatsFonamentals();
        assertEquals(expResult, result);
    }
    
}
