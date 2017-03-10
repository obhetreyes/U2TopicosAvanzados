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
public class paloma extends Animal{
   double ruu;
    public paloma(double ruu){
    this.ruu = ruu;
}
@Override
public double getSonido(){
    return ruu;
} 
}
