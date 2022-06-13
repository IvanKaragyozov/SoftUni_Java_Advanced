package S03_SetsAndMaps.lectures.maps;

import java.util.*;

public class AverageStudentGrades {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        //  String[] data = scanner.nextLine().split("\\s+");

        Map<String, List<Double>> studentDataMap = new TreeMap<>();


        for (int i = 0; i < numberOfStudents; i++) {

            String input = scanner.nextLine();
            String name = input.split("\\s+")[0];
            double grade = Double.parseDouble(input.split("\\s+")[1]);

            if (!studentDataMap.containsKey(name)) {
                studentDataMap.put(name, new ArrayList<>());
            }
            // adds grade to corresponding student
            studentDataMap.get(name).add(grade);
        }

        studentDataMap.entrySet().forEach(entry -> {
            double sum = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                sum += entry.getValue().get(i);
            }
            double avg = sum / entry.getValue().size();
            System.out.print(entry.getKey() + " -> ");
            entry.getValue().forEach(e -> System.out.printf("%.2f ", e));
            System.out.printf("(avg: %.2f)%n", avg);
        });

    }
}
