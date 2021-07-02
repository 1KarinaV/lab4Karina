package Creatures;

public abstract class Entity {
    public String name;
    public long id;
    private static long idCount = 1;
    public Entity(String name,boolean needDescription){
        this.name=name;
        this.id=idCount++;
        if (needDescription) System.out.println("Сущность с названием \""+this.name+"\" создана.id["+this.id+"]");
    }

    //Переопределение метода toString
    @Override
    public String toString(){
        return this.name;
    }

}
