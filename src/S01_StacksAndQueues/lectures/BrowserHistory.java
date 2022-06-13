package S01_StacksAndQueues.lectures;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> browserURL = new ArrayDeque<>();

        String input = scanner.nextLine();
        // String currentURL = "";

        while (!input.equals("Home")){

            if(input.equals("back")){
                // back
                if(browserURL.size() > 1){
                    browserURL.pop();
                    // currentURL = browserURL.peek();
                    // System.out.println(currentURL);
                    System.out.println(browserURL.peek());
                } else System.out.println("no previous URLs");
            }
            else {
                // url
                browserURL.push(input);
                System.out.println(browserURL.peek());
            }
            input = scanner.nextLine();
        }
    }
}
