package S03_SetsAndMaps.exercises;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class PeriodicTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<String> uniqueElements = new LinkedHashSet<>();

        for (int row = 0; row < n; row++) {

            String[] chemicalElements = scanner.nextLine().split("\\s+");

            // 1.
            // for(String element : chemicalElements){
            //     uniqueElements.add(element);
            // }

            // 2.
            // Collections.addAll(Arrays.asList(chemicalElements), uniqueElements);

            // 3.
            uniqueElements.addAll(Arrays.asList(chemicalElements));
        }
        uniqueElements.forEach(e -> System.out.print(e + " "));

    }
}
