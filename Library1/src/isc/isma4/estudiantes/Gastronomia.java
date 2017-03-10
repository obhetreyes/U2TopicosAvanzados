/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc.isma4.estudiantes;

/**
 *
 * @author skillet
 */
public class Gastronomia extends Estudiante{
     double blanco;
    public Gastronomia(double blanco){
    this.blanco = blanco;
}
@Override
public double getColor(){
    return blanco;
}
}
