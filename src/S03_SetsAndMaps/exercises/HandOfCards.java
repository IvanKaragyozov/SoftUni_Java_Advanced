package S03_SetsAndMaps.exercises;

import java.util.*;

public class HandOfCards {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Set<String>> players = new LinkedHashMap<>();

        while (!input.equals("JOKER")){

            String playerName = input.split(":\\s+")[0];
            String playerCards = input.split(":\\s+")[1];
            String[] cardsArr = playerCards.split(", ");

            // 1. fill the cards in set
            Set<String> cardsSet = new HashSet<>();
            cardsSet.addAll(Arrays.asList(cardsArr));

            // 2. fill data in map
            if(!players.containsKey(playerName)) players.put(playerName, cardsSet);
            else{
                Set<String> currentCards = players.get(playerName);
                cardsSet.addAll(Arrays.asList(cardsArr));
                players.put(playerName, cardsSet);
            }

            input = scanner.nextLine();
        }

    }
}
