/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import examencodjunit.Calculo;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.Parameterized;

/**
 *
 * @author oracle
 */
public class CalculoBateriaTest {

    private Calculo Calculo;
    private int num1, num2;
    private int resultado;
    
    @Before
    public void initialize() {
        Calculo cal = new Calculo();
    }

    public CalculoBateriaTest(int num1, int num2, int resultado) {
        this.num1 = num1;
        this.num2 = num2;
        this.resultado = resultado;
    }

    @Parameterized.Parameters
    public static Collection calculartest() {
        return Arrays.asList(new Object[][]{
            {41, 22, 1},
          //mal
            {100, 22, 34},
            {50, 5, 5},
            {10, 40, 10}
        });
    }

    /**
     * Test of obtenerMCD method, of class Calculo.
     */
    @Test
    public void testObtenerMCD() {
        System.out.println("El máximo común divisor de " + num1 + " y " + num2 + " es: " + resultado);
        int result = Calculo.obtenerMCD(num1, num2);
        assertEquals(resultado, result, 0);
    }

}

