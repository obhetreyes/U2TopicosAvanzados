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
public class Elipse extends Figura{
 double r1;
    double r2;
    public Elipse (double r1, double r2){
        this.r1= r1;
        this.r2= r2;
    }


  
    @Override
public double getArea(){
    return Math.PI*r1*r2;
}   
}
