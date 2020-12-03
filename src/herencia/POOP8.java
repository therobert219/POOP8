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
public class POOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("1********************************");
        
        Poligono poligono=new Poligono();
        System.out.println("poligono"+poligono);
        /* las clases Bases pueden comportarse como subclases
       */
        Object objeto=new Object();
        System.out.println("Objec "+objeto);
         
        objeto=poligono;
        System.out.println("objec como poligono"+objeto);
       
        Object objeto2=new Poligono();
        System.out.println("objec2 "+objeto2); 
        
        Object objeto3=new Poligono();
        System.out.println("objec3 "+objeto3);
        
        System.out.println("2********************************");
        
        poligono=new Triangulo();
        System.out.println(poligono);
        selectorPoligonos(poligono);
        
        poligono=new Cuadrilatero();
        System.out.println(poligono);
        selectorPoligonos(poligono);
        
        Poligono poligono2=new Poligono();
        System.out.println(poligono);
        selectorPoligonos(poligono);
    }
    /**
     * 
     * @param poligono 
     */
    public static void selectorPoligonos(Poligono poligono){
        if(poligono instanceof Triangulo){
            System.out.println("el objeto es un triangulo");}
        else if(poligono instanceof Cuadrilatero){
            System.out.println("el objeto es un cuadrilatero");}   
        else if((poligono instanceof Poligono)){
            System.out.println("el objeto es un poligono");}   
        else{
            System.out.println("el objeto es otra figura");
        }
    }
}
