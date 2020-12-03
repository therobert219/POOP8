/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Luis Humberto
 */
public class Triangulo extends Poligono{
    private float a,b,c,base,altura;
    private int alpha, beta, gamma;
    /*
    
    */
    public Triangulo() {
    }
    /**
     * 
     * @param a
     * @param b
     * @param c
     * @param base
     * @param altura
     * @param alpha
     * @param beta
     * @param gamma 
     */
    public Triangulo(float a, float b, float c, float base, float altura, int alpha, int beta, int gamma) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
        this.alpha = alpha;
        this.beta = beta;
        this.gamma = gamma;
    }

    /**
     * 
     * @return a
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
    public float getC() {
        return c;
    }
    /**
     * 
     * @param c 
     */
    public void setC(float c) {
        this.c = c;
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
    public int getGamma() {
        return gamma;
    }
/**
 * 
 * @param gamma 
 */
    public void setGamma(int gamma) {
        this.gamma = gamma;
    }
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "Triangulo{" + "a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + ", alpha=" + alpha + ", beta=" + beta + ", gamma=" + gamma + '}';
    }
   /**
    * 
    * @return base*altura/2
    */ 
    @Override
    public float area(){
        return base*altura/2;
    }
    /**
     * 
     * @return a+b+c
     */
    @Override
    public float perimetro(){
        return a+b+c;
    }
}
