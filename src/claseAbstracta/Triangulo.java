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

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    public int getBeta() {
        return beta;
    }

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public int getGamma() {
        return gamma;
    }

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
        
    
    public float area(){
        return base*altura/2;
    }
    @Override
    public float perimetro(){
        return 2 * a + 2 * b;
    }
    
}
