/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc.isma4.figuras;

/**
 *
 * @author skillet
 */
public class Pentagono extends Figura{
    double p;
    double ap;
    public Pentagono (double p, double ap){
        this.p = p;
        this.ap = ap;
    }

 
    @Override
public double getArea(){
    return (p*ap)/2;
} 
   
}
