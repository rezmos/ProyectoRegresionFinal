package edu.uniandes.ecos.ASE.app;


import com.greatideas.app.model.RangoTamanio;
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
     * TestCase1. Se evalua que la lista tenga por lo menos un elemento
     * 
     * @author Claudia Marcela Alvarez Ramos
     */
    public void testCase1()
    {
       assertEquals(listaDeDatos.size()>0, true);
    }
    
      /**
     * #Method
     * 
     * TestCase2. Se evalua que los valores de la lista sean mayores a cero, dado que si no cumplen esta condicion el ln no se puede calcular
     * 
     * @author Claudia Marcela Alvarez Ramos
     */
    public void testCase2()
    {
        LinkedList<Double> lValores = (LinkedList<Double>)listaDeDatos.get(0);
        for (Double valor : lValores) {
            assertEquals(valor>0, true);
        }
    }
    
     /**
     * #Method
     * 
     * TestCase3. Evalua los valores esperados frente a los actuales
     * 
     * @author Claudia Marcela Alvarez Ramos
     */
    public void testCase3()
    {
        RangoTamanio rt = new RangoTamanio((LinkedList<Double>)listaDeDatos.get(0));
        System.out.println(rt);
        assertEquals(rt.getVS()>4.3950 && rt.getVS()<4.3955, true);
        assertEquals(rt.getS()>8.5078 && rt.getS()<8.5082, true);
        assertEquals(rt.getM()>16.4692 && rt.getM()<16.4696, true);
        assertEquals(rt.getL()>31.8806 && rt.getL()< 31.8811, true);
        assertEquals(rt.getVL()>61.7132 && rt.getVL()<61.7137, true);
        
    }
}
