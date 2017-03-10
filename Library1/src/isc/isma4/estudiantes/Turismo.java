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
public class Turismo extends Estudiante{
    double amarillo;
    public Turismo(double amarillo){
    this.amarillo = amarillo;
}
@Override
public double getColor(){
    return amarillo;
}
}
