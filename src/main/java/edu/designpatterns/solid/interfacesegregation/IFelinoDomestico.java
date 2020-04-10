package edu.designpatterns.solid.interfacesegregation;

import edu.designpatterns.solid.liskov.IFelino;

public interface IFelinoDomestico extends IFelino {

    //Se segrega la interfaz felino para que el jaguar no tenga asignado el maullar
    //cumpliendo asi con la segregaciòn de interfaces

    void maullar();
}
