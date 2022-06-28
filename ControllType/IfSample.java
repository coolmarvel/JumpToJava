package ControllType;

import java.util.ArrayList;

public class IfSample {
    public static void main(String[] args) {
        int money = 2000;
        boolean hasCard = true;
        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("paper");
        pocket.add("handphone");

        if (money >= 3000 || hasCard) {
            System.out.println("택시를 타고 가라");
        } else {
            System.out.println("걸어가라");
        }

        if (pocket.contains("money")) {
            System.out.println("택시를 타고 가라");
        } else if (hasCard) {
            System.out.println("택시를 타고 가라");
        } else {
            System.out.println("걸어가라");
        }
    }
}
