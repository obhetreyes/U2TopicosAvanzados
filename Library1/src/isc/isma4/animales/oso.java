/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc.isma4.animales;

/**
 *
 * @author skillet
 */
public class oso extends Animal{
    double grrr;
    public oso(double grrr){
    this.grrr = grrr;
}
@Override
public double getSonido(){
    return grrr;
}
}