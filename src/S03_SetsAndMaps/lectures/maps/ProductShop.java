package S03_SetsAndMaps.lectures.maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ProductShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("Revision")){

            String nameOfStore = input.split(", ")[0];
            String nameOfProduct = input.split(", ")[1];
            double price = Double.parseDouble(input.split(", ")[2]);

            Map<String, Map<String, List<Double>>> storeMap = new HashMap<>();


            if(!storeMap.get(nameOfStore).containsKey(nameOfProduct)){
                storeMap.put(nameOfStore, new HashMap<>());
            }

            storeMap.get(nameOfStore).get(nameOfProduct).add(price);



            input = scanner.nextLine();
        }

    }
}
