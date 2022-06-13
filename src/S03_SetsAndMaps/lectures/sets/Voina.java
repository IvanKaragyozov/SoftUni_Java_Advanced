package S03_SetsAndMaps.lectures.sets;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Voina {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> firstPlayer = Arrays.stream(scanner.nextLine()
                .split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        LinkedHashSet<Integer> secondPlayer = Arrays.stream(scanner.nextLine()
                .split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        for (int round = 0; round < 50; round++) {

            if(firstPlayer.isEmpty()){
                System.out.println("Second player win!");
                return;
            }
            if(secondPlayer.isEmpty()){
                System.out.println("First player win!");
                return;
            }

            // get cards from both players
            int firstPlayerCard = firstPlayer.iterator().next();
            int secondPlayerCard = secondPlayer.iterator().next();

            // remove the cards from the players
            firstPlayer.remove(firstPlayerCard);
            secondPlayer.remove(secondPlayerCard);

            // compare cards
            // if first player's card has bigger value
            if(firstPlayerCard > secondPlayerCard) {
                firstPlayer.add(firstPlayerCard);
                firstPlayer.add(secondPlayerCard);
                // if second player's card has bigger value
            } else if(secondPlayerCard > firstPlayerCard){
                secondPlayer.add(firstPlayerCard);
                secondPlayer.add(secondPlayerCard);
            } else {
                // if card's value is even
                firstPlayer.add(firstPlayerCard);
                secondPlayer.add(secondPlayerCard);
            }
        }

        // compare the decks of the players
        int firstPlayerDeckSize = firstPlayer.size();
        int secondPlayerDeckSize = secondPlayer.size();

        if(firstPlayerDeckSize > secondPlayerDeckSize){
            System.out.println("First player win!");
        }
        else if(secondPlayerDeckSize > firstPlayerDeckSize){
            System.out.println("Second player win!");
        } else System.out.println("Draw!");


    }

    private static Integer getTopValueFromPlayer(LinkedHashSet<Integer> player){

        for(int card : player) return card;

        return 0;
    }
}
