package Creatures;

import Exceptions.*;
import Interfaces.*;
import Enum.*;

public class Snusmumrick extends Troll implements WalkAble, FeelAble {

    public Snusmumrick(String name) {
        super(name);
    }

    public void whistle(Adverbs how, Place place) throws notQuietWhistleException {

        //локальный класс свиста(находится в методе whistle)
        class Whistle extends Entity {
            Adverbs how ;
            public Whistle(String name, Adverbs how) {
                super(name, false);
                this.how = how;
                System.out.println("Свист с параметром \""+how.getTitle()+"\" создан.id["+this.id+"]");
            }

            // Меняем метод equals на сравнение по параметру adverbs
            @Override
            public boolean equals(Object obj) {
                return this.how.equals((Adverbs) obj);
            }
        }

        Whistle whistle = new Whistle("Свист",how);

        System.out.println("В месте \""+place+"\" раздался свист с параметром \""+whistle.how.getTitle()+"\".");

        //Выбрасываем unchecked исключение, следовательно throws в описании метода писать не надо и try/catch тоже

        if (!whistle.how.equals(Adverbs.Quiet)) throw new notQuietWhistleException();

    }
    public void notGoBack(){
        System.out.println("Тролль с именем \""+this+"\" ещё не возвращался.");
    }

    @Override
    public void feelSadly() {

    }

    @Override
    public void feelJoy(Entity entity) {

    }


    @Override
    public void go(Adverbs how) {
        System.out.println("В такие ночи \""+this+"\" обычно бродил \""+how.getTitle()+"\" с предметом \""+
                //Анонимный класс(не имеет имени,используется один раз)
                new Entity("Гармошка",true){} +"\"");

    }

    @Override
    public void go(Place where, Adverbs how) {

    }
    public void goJourney(){
        System.out.println("\""+this+"\" отправился в путешествие делать октрытия.");
    }
    public void createTent(Place where, Adverbs how){
        System.out.println("\""+how.getTitle()+"\" тролль с именем \""+this+"\" разобьёт в месте \""+where+"\" палатку.");
    }
    public void stopSpendingNight(Place where){
        System.out.println("Тролль с именем \""+this+"\" перестанет ночевать в месте \""+where+"\".");
    }

    public void stay(Place place){
        System.out.println("Тролль с именем \""+this+"\" стоял в месте \""+place+"\".");
    }
}
