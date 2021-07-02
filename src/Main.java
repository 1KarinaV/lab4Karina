import Creatures.*;
import Enum.*;
import Exceptions.*;

public class Main {
    public static void main(String[] args){
        Place home = new Place("Дом");
        MumiyTroll mumiyTroll = new MumiyTroll("Муми-тролль");
        Snusmumrick snusmumrick = new Snusmumrick("Снусмумрик");
        snusmumrick.notGoBack();
        snusmumrick.go(Adverbs.Alone);
        Troll.Song.noSong();
        Place shore = new Place("Речной берег");
        System.out.println("\n<Предположение>");
            snusmumrick.goJourney();
            snusmumrick.createTent(shore, Adverbs.Soon);
            snusmumrick.stopSpendingNight(home);
        System.out.println("</Предположение>\n");
        mumiyTroll.sigh();
        mumiyTroll.feelSadly();
        Place window = new Place("Окно");
        Place underWindow = new Place("Под окном");
        //Checked исключение, необходимо заключить в блок try/catch
        try {
            //snusmumrick.whistle(Enum.Adverbs.Quiet, underWindow);
            //Показать работу checked exception в методе whistle при неправильном параметре
           snusmumrick.whistle(Adverbs.Loudly,underWindow);
        } catch (Exception e){
            System.err.println(e.getLocalizedMessage());
            mumiyTroll.go(window, Adverbs.Quietly);
            Troll unknown = new Troll("Подозрительный незнакомец.") {};
            mumiyTroll.lookOut();
            //непроверяемое исключение, в блок try/catch помещать не надо; При этом программа завершится "некорректно".
            if (!mumiyTroll.equals(unknown)) throw new NotSnusmumrickException();
        }

        MumiyTroll.Heart heart = mumiyTroll.new Heart();
        mumiyTroll.feelJoy(heart);
        mumiyTroll.go(window, Adverbs.Quietly);
        mumiyTroll.lookOut();
        Place under = new Place("Внизу у веревочной лестницы");
        snusmumrick.stay(under);

    }
}
