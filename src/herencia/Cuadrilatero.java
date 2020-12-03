/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Roberto Carlos
 */
public class Cuadrilatero extends Poligono{
    private int alpha, beta;
    private float a,b,base, altura;
    
    public Cuadrilatero() {
    }
    
    /**
     * 
     * @param alpha
     * @param beta
     * @param a
     * @param b
     * @param base
     * @param altura 
     */
    public Cuadrilatero(int alpha, int beta, float a, float b, float base, float altura) {
        this.alpha = alpha;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.base = base;
        this.altura = altura;
    }
    /**
     * 
     * @return 
     */
    public int getAlpha() {
        return alpha;
    }
    /**
     * 
     * @param alpha 
     */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
    /**
     * 
     * @return 
     */
    public int getBeta() {
        return beta;
    }
    /**
     * 
     * @param beta 
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    /**
     * 
     * @return 
     */
    public float getA() {
        return a;
    }
    /**
     * 
     * @param a 
     */
    public void setA(float a) {
        this.a = a;
    }
    /**
     * 
     * @return 
     */
    public float getB() {
        return b;
    }
    /**
     * 
     * @param b 
     */
    public void setB(float b) {
        this.b = b;
    }
    /**
     * 
     * @return 
     */
    public float getBase() {
        return base;
    }
    /**
     * 
     * @param base 
     */
    public void setBase(float base) {
        this.base = base;
    }
    /**
     * 
     * @return 
     */
    public float getAltura() {
        return altura;
    }
    /**
     * 
     * @param altura 
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "Cuadrilatero{" + "alpha=" + alpha + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    }
}
