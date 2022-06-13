package S03_SetsAndMaps.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, String> phoneBook = new HashMap<>();
        String data = scanner.nextLine();

        // 1. fill phone book
        while(!data.equals("search")){

            String name = data.split("-")[0];
            String phoneNumber = data.split("-")[1];
            phoneBook.put(name, phoneNumber);

            data = scanner.nextLine();
        }

        // 2. checking inside phone book
        String name = scanner.nextLine();
        while(!name.equals("stop")){

            if(phoneBook.containsKey(name)){
                System.out.println(name + " -> " + phoneBook.get(name));
            }
            else System.out.printf("Contact %s does not exist.%n", name);

            name = scanner.nextLine();
        }
    }
}
