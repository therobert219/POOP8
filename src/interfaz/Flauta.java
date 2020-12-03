/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author Luis Humberto
 */
public class Flauta extends InstrumentoViento {
    
    public Flauta() {
    }
    /**
     * 
     * @return 
     */
    @Override
    public String tipoInstrumento(){
        return "Flauta";
    }
/**
 * 
 * @return 
 */
    @Override
    public String toString() {
        return "Flauta{" + '}';
    }
  
}
