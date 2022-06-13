package S01_StacksAndQueues.lectures;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ArrayDeque<String> files = new ArrayDeque<>();

        while(!input.equals("print")){
            if(input.equals("cancel")){
                //cancel Logic
                if(files.isEmpty()){
                    //empty
                    System.out.println("Printer is on standby");
                }
                else {
                    //not empty
                    String firstFileInQueue = files.poll();
                    System.out.printf("Canceled %s%n", firstFileInQueue);
                }
            } else {
                //we have a file
                files.offer(input);
            }
            input = scanner.nextLine();
        }
        for (String file : files) System.out.println(file);
    }
}
