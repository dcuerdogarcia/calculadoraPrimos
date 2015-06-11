/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadoraprimos;

/**
 *
 * @author oracle
 */
public class logic {

    public static float realizaOperacion(Modelo mod) {
        float resultado = 0;
        switch (mod.getOperacion()) {
            case 1:
                resultado = mod.getNum1() + mod.getNum2();
                break;
            case 2:
                resultado = mod.getNum1() - mod.getNum2();
                break;
            case 3:
                resultado = mod.getNum1() * mod.getNum2();
                break;
            case 4:
                resultado = mod.getNum1() / mod.getNum2();
                break;
            case 5:
                System.exit(0);
                break;

        }
        mod.setResultado(resultado);
        return resultado;
    }
}
