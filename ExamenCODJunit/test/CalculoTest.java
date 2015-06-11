/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import examencodjunit.Calculo;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author oracle
 */
public class CalculoTest {
    
    public CalculoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    

    /**
     * Test of obtenerMCD method, of class Calculo.
     */
    @Test
    public void testObtenerMCD() {
        
        System.out.println("obtenerMCD");
        int num1 = 8;
        int num2 = 4;
        Calculo instance = new Calculo();
        int expResult = 12;
        int result = instance.obtenerMCD(num1, num2);
        assertEquals(expResult, result);
        
        
    }
    
}