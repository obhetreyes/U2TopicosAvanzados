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
public class perro extends Animal{
    double woof;
    public perro(double woof){
    this.woof = woof;
}
@Override
public double getSonido(){
    return woof;
}
}
