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
public class CalculoMensajeTest {

    public CalculoMensajeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of mensajes method, of class Calculo.
     */
    @Test
    public void testMensajes() {
        System.out.println("mensajes");

        Calculo instance = new Calculo();
        instance.mensajes();

        String expResult = "Debe introducir un número válido: null";
        String result = instance.mensajes();
        assertEquals(expResult, result);

    }

}
