/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculadoraprimos.Modelo;
import calculadoraprimos.logic;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author oracle
 */

@RunWith(Parameterized.class)
public class logicParamTest {
   private Modelo mod;
   private float result;
   
   

   @Before
   public void initialize() {
   }

    public logicParamTest(Modelo mod, float result) {
        this.mod = mod;
        this.result = result;
    }

  

   @Parameterized.Parameters
   public static Collection primeNumbers() {
      return Arrays.asList(new Object[][] {
         { new Modelo(5, 5, 1, 10),10}
         
      });
   }

   @Test
   public void testPrimeNumberChecker() {
      System.out.println("Parameterized Number is : " + result);
      assertEquals(result,logic.realizaOperacion(mod),0.0);
   }
}
    