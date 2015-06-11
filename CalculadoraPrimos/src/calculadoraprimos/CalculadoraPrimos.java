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
public class CalculadoraPrimos {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Modelo mod = new Modelo();
        Vista vis = new Vista();
        logic log = new logic();
        vis.introducir(mod);
        log.realizaOperacion(mod);
        vis.imprimir(mod);
        
    }
    
}
  
