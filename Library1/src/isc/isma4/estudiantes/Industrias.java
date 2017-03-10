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
public class Industrias extends Estudiante{
    double azul_subido;
    public Industrias(double azul_subido){
    this.azul_subido = azul_subido;
}
@Override
public double getColor(){
    return azul_subido;
}
}
