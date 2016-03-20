package edu.uniandes.ecos.ASE.app;


import edu.uniandes.ecos.ASE.app.model.EstructuraRegresionLineal;
import static edu.uniandes.ecos.ASE.app.model.RegresionLineal.obtenerDatosRegresionLineal;
import java.util.LinkedList;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import util.Archivo;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    private LinkedList listaDeDatos = Archivo.leerArchivo();
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
        
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    /**
     * #Method
     * 
     * TestCase1
     * 
     * @author Claudia Marcela Alvarez Ramos
     */
    public void testCase1()
    {
        EstructuraRegresionLineal case1 = obtenerDatosRegresionLineal((LinkedList)listaDeDatos.get(0), (LinkedList)listaDeDatos.get(2), 2,4,4,4,3);
        assertEquals(case1.getB0(), -22.55);
        assertEquals(case1.getB1(), 1.7279);
        assertEquals(case1.getRxy(),0.9545);
        assertEquals(case1.getR2(),0.9111);
        assertEquals(case1.getYk(),644.429);
    }
    
     /**
     * #Method
     * 
     * TestCase2
     * 
     * @author Claudia Marcela Alvarez Ramos
     * 
     */
    public void testCase2()
    {
        EstructuraRegresionLineal case2 = obtenerDatosRegresionLineal((LinkedList)listaDeDatos.get(0), (LinkedList)listaDeDatos.get(3), 3,4,4,4,3);
        assertEquals(case2.getB0(), -4.039);
        assertEquals(case2.getB1(), 0.1681);
        assertEquals(case2.getRxy(),0.9333);
        assertEquals(case2.getR2(),0.8711);
        assertEquals(case2.getYk(),60.858);
    }
    
     /**
     * #Method
     * 
     * TestCase3
     * 
     * @author Claudia Marcela Alvarez Ramos
     */
    
    public void testCase3()
    {
        EstructuraRegresionLineal case3 = obtenerDatosRegresionLineal((LinkedList)listaDeDatos.get(1), (LinkedList)listaDeDatos.get(2), 2,5,4,4,4);
        assertEquals(case3.getB0(), -23.92);
        assertEquals(case3.getB1(), 1.43097);
        assertEquals(case3.getRxy(),0.9631);
        assertEquals(case3.getR2(),0.9276);
        assertEquals(case3.getYk(),528.4294);
    }
    
     /**
     * #Method
     * 
     * TestCase4
     * 
     * @author Claudia Marcela Alvarez Ramos
     */
    
    public void testCase4()
    {
        EstructuraRegresionLineal case4 = obtenerDatosRegresionLineal((LinkedList)listaDeDatos.get(1), (LinkedList)listaDeDatos.get(3), 3,6,4,4,4);
        assertEquals(case4.getB0(), -4.604);
        assertEquals(case4.getB1(), 0.140164);
        assertEquals(case4.getRxy(),0.948);
        assertEquals(case4.getR2(),0.8988);
        assertEquals(case4.getYk(),49.4994);
    }
    
    
    
}
