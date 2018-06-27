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
public class Square implements GeometriskaFigura {
    
    int mala;


    public Square(int mala) {
        this.mala = mala;
    }

    @Override
    public double laukums() {
        return mala * mala;
    }

    @Override
    public double perimetrs() {
        return mala * 4;
    }

 

    
}
