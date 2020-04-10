package edu.designpatterns.creational.factory;

public class FactoryEx {
    public static void main(String[] args) {
        //Pizza pizzaPeperoni = new Pizza(8); //NO
        Pizzeria pizzeria = new Pizzeria();
        Pizza pizzaPeperoni = pizzeria.crearPizza("Peperoni");
        System.out.println(pizzaPeperoni);
        Pizza pizzaOrillaRellena = pizzeria.crearPizza("OrillaRellena");
        System.out.println(pizzaOrillaRellena);
    }
}
