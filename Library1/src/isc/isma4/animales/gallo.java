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
public class gallo extends Animal{
    double kikiriki;
    public gallo(double kikiriki){
    this.kikiriki = kikiriki;
}
@Override
public double getSonido(){
    return kikiriki;
}
}

    