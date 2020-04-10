package edu.designpatterns.solid.singleresponsabilty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Triangulo implements IFigura{

    private float base;
    private float altura;

    public float getArea(){
        return base*altura/2;
    }

}
