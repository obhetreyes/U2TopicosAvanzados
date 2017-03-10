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
public class Rombo extends Figura{
    double a;
    double b;
    double h;
    public Rombo (double a, double b, double h){
    this.a = a;
    this.b = b;
    this.h = h;
    }
    @Override
    public double getArea(){
        return h*(a*b)/h;
    }
}
