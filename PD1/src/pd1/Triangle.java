/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd1;

/**
 *
 * @author Matiss-Study
 */
public class Triangle implements GeometriskaFigura{
    
    int vienaMala;
    int otraMala;
    int tresaMala;

    public Triangle(int vienaMala, int otraMala, int tresaMala) {
        this.vienaMala = vienaMala;
        this.otraMala = otraMala;
        this.tresaMala = tresaMala;
    }
    
    

    @Override
    public double laukums() {
        double perimetrs = vienaMala + otraMala +tresaMala;
        return Math.sqrt(perimetrs * (perimetrs - vienaMala)*(perimetrs - otraMala)*(perimetrs - tresaMala));
        
    }

    @Override
    public double perimetrs() {
        double perimetrs = vienaMala + otraMala +tresaMala;
        return perimetrs;
    }
    
    
    
}
