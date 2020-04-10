package edu.designpatterns.solid.singleresponsabilty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Rectangulo implements IFigura{

    private float altura;
    private float base;

    private Rectangulo(){}

    public float getArea(){
        return altura*base;
    }


}
