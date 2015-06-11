/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadoraprimos;

import javax.swing.JOptionPane;

/**
 *
 * @author oracle
 */
public class Vista {
    public void introducir(Modelo mod){
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Dame el primer numero de la operacion"));
        mod.setNum1(num1);
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Dame el segundo numero de la operacion"));
        mod.setNum2(num2);
        int operacion= Integer.parseInt(JOptionPane.showInputDialog("Que operacion quieres hacer?\n"
                + "1-Suma\n"
                + "2-Resta\n"
                + "3-Multiplicacion\n"
                + "4-Division\n"
                + "5-Salir"));
        mod.setOperacion(operacion);
        
    }

    public  void imprimir(Modelo mod) {

        JOptionPane.showMessageDialog(null, "Primer numero: " +mod.getNum1()+" Segundo: "+mod.getNum2()+" Operacion: "+mod.getOperacion()+" Resultado: "+ mod.resultado);
    }
}