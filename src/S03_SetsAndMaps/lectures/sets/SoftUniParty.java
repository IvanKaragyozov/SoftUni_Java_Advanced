package S03_SetsAndMaps.lectures.sets;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // enter guestIDs
        Set<String> vip = new TreeSet<>();
        Set<String> regular = new TreeSet<>();
        String guestID = scanner.nextLine();

        while(!guestID.equals("PARTY") && guestID.length() == 8){

            // if first char starts with digit == vip
            // else == regular
            if(Character.isDigit(guestID.charAt(0))) vip.add(guestID);
            else regular.add(guestID);

            guestID = scanner.nextLine();
        }

        while (!guestID.equals("END")){

            vip.remove(guestID);
            regular.remove(guestID);

            guestID = scanner.nextLine();
        }

        // print result
        System.out.println(vip.size() + regular.size());
        for(String vipGuest : vip) System.out.println(vipGuest);
        for(String regularGuest : regular) System.out.println(regularGuest);

    }
}
