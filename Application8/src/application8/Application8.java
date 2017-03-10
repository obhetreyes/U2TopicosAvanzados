/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application8;
import isc.isma4.figuras.IFigura;
import isc.isma4.animales.IAnimal;
import isc.isma4.estudiantes.IEstudiante;
import isc.isma4.algoritmos.IAlgoritmo;
/**
 *
 * @author skillet
 */
public class Application8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public double getFigureArea(IFigura figure){
        return figure.getArea();
    }
    public double getAnimalesSonido(IAnimal animales){
            return animales.getSonido();
        }
          public double getEstudiantesColor(IEstudiante estudiantes){
            return estudiantes.getColor();
        }
}
