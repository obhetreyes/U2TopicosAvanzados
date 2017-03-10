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
public class Energias extends Estudiante{
     double negro;
    public Energias(double negro){
    this.negro = negro;
}
@Override
public double getColor(){
    return negro;
}
}
