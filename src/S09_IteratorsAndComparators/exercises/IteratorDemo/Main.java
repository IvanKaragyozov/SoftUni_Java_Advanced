package S09_IteratorsAndComparators.exercises.IteratorDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //iterable - обходим елемент (витрина)
        //iterator - обхожда витрината (shopAssistant)
        GameShop pulsar = new GameShop();
        List<String> games = new ArrayList<>();
        games.add("NBA 2k22");
        games.add("God Of War");
        games.add("FIFA 2022");
        games.add("GTA V");
        games.add("SPIDER MAN");
        games.add("IRON MAN");
        pulsar.setGames(games);

        Iterator<String> shopAssistant = pulsar.iterator();
        while (shopAssistant.hasNext()) {
            System.out.println(shopAssistant.next());
        }
    }
}
