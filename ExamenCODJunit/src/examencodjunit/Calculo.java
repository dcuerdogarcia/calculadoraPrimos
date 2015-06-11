/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examencodjunit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author damian
 */
public class Calculo {

    private int numero1;
    private int numero2;
    private String mensajeResultado = "";

    public Calculo() {
    }

    public Calculo(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //setters
    public void setNumero1(int numero) {
        this.numero1 = numero;
        //si el número es negativo cambiamos a cero y
        //establecemos la propiedad "mensajeResultado" a "Error"
        if (numero < 0) {
            mensajeResultado = "Error, los números no pueden ser negativos";
        }
    }

    public void setNumero2(int numero) {
        this.numero2 = numero;
        //si el número es negativo cambiamos a cero y
        //establecemos la propiedad "mensajeResultado" a "Error"
        if (numero < 0) {
            mensajeResultado = "Error, los números no pueden ser negativos";
        }
    }

    //resultado del cálculo del MCD
    public String getMensajeResultado() {
        return mensajeResultado;
    }

    public String mensajes() {

        String mensaje = "";

        try {
            BufferedReader entradaTeclado = new BufferedReader(
                    new InputStreamReader(System.in));
            System.out.print("Introduzca el número 1: ");
            int num1 = Integer.parseInt(entradaTeclado.readLine());

            if (num1 < 0) {
                mensaje = "Error, los numeros no pueden ser negativos";
                return mensaje;
            }

            System.out.print("Introduzca el número 2: ");
            int num2 = Integer.parseInt(entradaTeclado.readLine());

            if (num2 < 0) {
                mensaje = "Error, los numeros no pueden ser negativos";
                return mensaje;
            }

            this.setNumero1(num1);
            this.setNumero2(num2);

        } catch (NumberFormatException e) {
            mensaje = ("Debe introducir un número válido: "
                    + e.getMessage());
        } catch (IOException e) {
            mensaje = ("Error al introducir datos: "
                    + e.getMessage());
        }
        return mensaje;
    }

}
