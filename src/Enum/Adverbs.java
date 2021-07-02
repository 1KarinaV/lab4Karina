package Enum;

public enum Adverbs {


    Loudly("Громко"),
    Alone("Один"),
    Soon("Скоро"),
    Sadly("Грустно"),
    Quiet("Негромко"),
    Quietly("Тихонько"),
    Secretly("Совершенно секретно");

    private String title;

    Adverbs(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


}