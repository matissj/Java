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
public class Rectangle implements GeometriskaFigura {
    public int vienaMala;
    public int otraMala;

    public Rectangle(int vienaMala, int otraMala) {
        this.vienaMala = vienaMala;
        this.otraMala = otraMala;
    }

    
    
    @Override
    public double laukums() {
        return this.vienaMala * this.otraMala;
    }

    @Override
    public double perimetrs() {
        return (this.vienaMala + this.otraMala) * 2;
    }
    
    
}
