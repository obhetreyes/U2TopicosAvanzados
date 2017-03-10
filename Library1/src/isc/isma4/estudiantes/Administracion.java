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
public class Administracion extends Estudiante{
     double rojo;
    public Administracion(double rojo){
    this.rojo = rojo;
}
@Override
public double getColor(){
    return rojo;
}
}
