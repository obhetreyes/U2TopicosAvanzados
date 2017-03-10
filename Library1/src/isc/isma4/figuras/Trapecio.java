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
public class Trapecio extends Figura{
    double h;
    double a;
    double b;
      public Trapecio(double h, double a, double b){
    this.h = h;
    this.a = a;
    this.b = b;
}
      @Override
public double getArea(){
    return h*((a+b)/2);
}
}
