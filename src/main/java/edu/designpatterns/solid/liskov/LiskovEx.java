package edu.designpatterns.solid.liskov;

import edu.designpatterns.solid.interfacesegregation.IFelinoSalvaje;

public class LiskovEx {

    public static void main(String[] args) {

        //LISKOV, se puede usar una clase generica para usar una implementación
        IFelinoSalvaje jaguar = new Jaguar();
        jaguar.cazar();
        jaguar.rugir();
        //Lanza un error, se debe implementar la segregación de interfaces
        //jaguar.maullar();
    }
}
