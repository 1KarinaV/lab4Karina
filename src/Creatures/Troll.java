package Creatures;

public abstract class Troll extends Entity {
    private String trollName;
    public Troll(String name) {
        super(name,false);
        this.trollName=name;
        System.out.println("Тролль с именем \""+this+"\" создан.id["+this.id+"]");
    }

    //Вложенный non-static класс
    public class Heart extends Entity {
        public Heart() {
            super("Сердце "+trollName+".",false);
            System.out.println("Сердце с именем \""+name+"\" создано.id["+this.id+"]");
        }
        public void jumpedWithJoy(){
            System.out.println("\""+this.name+"\" подпрыгнуло от радости");
        }
    }

    // вложенный static класс
    public static class Song {
        public static void noSong(){
            System.out.println("В эту ночь песен не было слышно.");
        }
    }

}
