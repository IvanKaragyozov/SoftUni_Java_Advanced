package S06_DefiningClasses.exercises.opinionPoll;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> peopleList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String printInformation = scanner.nextLine();
            String name = printInformation.split("\\s+")[0];
            int age = Integer.parseInt(printInformation.split("\\s+")[1]);

            Person person = new Person(name, age);
            peopleList.add(person);
        }
        // Collects only people that are older than 30
        peopleList = peopleList.stream().filter(person -> person.getAge() > 30).collect(Collectors.toList());
        // Sorts them by name
        peopleList.sort(Comparator.comparing(person -> person.getName()));

        // print
        for (Person person : peopleList) {
            System.out.println(person);
        }

    }
}
