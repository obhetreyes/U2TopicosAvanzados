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
public class pato extends Animal{
    double cuac;
    public pato(double cuac){
    this.cuac = cuac;
}
@Override
public double getSonido(){
    return cuac;
}
}
     