/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraprimos;

/**
 *
 * @author oracle
 *
 */
public class Modelo {

    int num1;
    int num2;
    int operacion;
    float resultado;

    public Modelo() {
    }

    public Modelo(int num1, int num2, int operacion, float resultado) {
        this.num1 = num1;
        this.num2 = num2;
        this.operacion = operacion;
        this.resultado = resultado;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getOperacion() {
        return operacion;
    }

    public void setOperacion(int operacion) {
        this.operacion = operacion;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

}
