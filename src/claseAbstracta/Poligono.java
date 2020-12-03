/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseAbstracta;

/**
 *
 * @author Roberto Carlos
 */
public abstract class Poligono {
    /**
     * 
     * @return 
     */
    public abstract float area();
    public abstract float perimetro();
   
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
    
    
}
