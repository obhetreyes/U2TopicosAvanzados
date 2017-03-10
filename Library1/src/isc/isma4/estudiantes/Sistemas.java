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
public class Sistemas extends Estudiante{
    double azul_bajito;
    public Sistemas(double azul_bajito){
    this.azul_bajito = azul_bajito;
}
@Override
public double getColor(){
    return azul_bajito;
}
}
