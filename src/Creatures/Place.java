package Creatures;

import Creatures.Entity;

public class Place extends Entity {
    public Place(String name) {
        super(name,false);
        System.out.println("Место с названием \""+this+"\" создано.id["+this.id+"]");
    }
}
