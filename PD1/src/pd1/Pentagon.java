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
public class Pentagon implements GeometriskaFigura {
    int mala;

    public Pentagon(int mala) {
        this.mala = mala;
    }

    
    
    @Override
    public double laukums() {
        double laukums = 707;
        return laukums;
    }

    @Override
    public double perimetrs() {
        int perimetrs = mala * 5;
        return perimetrs;
        
    }
    
    
}
