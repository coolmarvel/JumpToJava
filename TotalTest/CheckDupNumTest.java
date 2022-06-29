package TotalTest;

import java.util.ArrayList;

public class CheckDupNumTest {
    static boolean CheckDupNum(String data) {
        ArrayList<String> result = new ArrayList<>();
        for (String c : data.split("")) {
            if (result.contains(c)) {
                return false; // 중복된 숫자가 있으면 fasle
            } else {
                result.add(c);
            }
        }
        return result.size() == 10; // 0~9 모두 10개의 숫자인지 확인
    }

    public static void main(String[] args) {
        System.out.println(CheckDupNum("0123456789")); // true
        System.out.println(CheckDupNum("01234")); // false
        System.out.println(CheckDupNum("01234567890")); // false
        System.out.println(CheckDupNum("6789012345")); // true
        System.out.println(CheckDupNum("012322456789")); // false
    }
}
