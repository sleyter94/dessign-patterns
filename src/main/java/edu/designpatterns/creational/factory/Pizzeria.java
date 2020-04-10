package edu.designpatterns.creational.factory;

public class Pizzeria implements IPizzeria{

    @Override
    public Pizza crearPizza(String tipo) {

        //El factory decide que tipo de objecto instanciar
        switch (tipo){
            case "Peperoni":
                return new Pizza(8, tipo);
            case "Hawaiana":
                return new Pizza(6, tipo);
            case "OrillaRellena":
                return new PizzaOrillaRellena(12, tipo);
            default:
                return null;
        }
    }
}
