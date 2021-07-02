package Creatures;

import Interfaces.*;
import Enum.*;

public class MumiyTroll extends Troll implements FeelAble, WalkAble {
    public MumiyTroll(String name) {
        super(name);
    }


    @Override
    public void feelSadly() {
        System.out.println("Тролль с именем \""+this+"\" почустовал грусть, хотя грустить было не о чем.");
    }

    @Override
    public void feelJoy(Entity heart) {
        System.out.println("Тролль с именем \""+this+"\" почустовал радость.");
        ((Heart)heart).jumpedWithJoy();
    }

    @Override
    public void go(Adverbs how) {

    }
    public void sigh(){
        System.out.println("Тролль с именем \""+this+"\" вздохнул.");
    }

    @Override
    public void go(Place where, Adverbs how) {
        System.out.println("Тролль с именем \""+this+"\" подошёл к месту \""+where+"\".");
    }

    public void lookOut() {
        System.out.println("Тролль с именем \"" + this + "\" выглянул наружу.");
    }
}
