package edu.designpatterns.solid.singleresponsabilty;

public class Presentacion {

    //La presentaciòn no debe depender de un objeto, se debe separar
    // esta responsabilidad a una nueva clase que vea solo esto

    //Abierto a la extensiòn y cerrado a la modificaciòn
    //Se crea una interfaz generica, para que no sea necesario modificar por cada nueva figura
    public void imprimir(IFigura figura){
        System.out.println(figura.getArea());
    }

}
