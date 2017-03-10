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
public class gato extends Animal{
    double mauu;
    public gato(double mauu){
    this.mauu = mauu;
}
@Override
public double getSonido(){
    return mauu;
} 
}
