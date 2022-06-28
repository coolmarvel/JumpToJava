package DataType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class DataTypeTest {

    enum CoffeeType {
        AMERICANO, ICE_AMERICANO, CAFE_LATTE
    };

    public static void main(String[] args) {
        // Q1 평균 점수를 구해보자
        int a = 80;
        int b = 75;
        int c = 55;
        System.out.println((a + b + c) / 3);

        // Q2 홀수 짝수 판별
        int num = 13;
        if (num % 2 == 1) {
            System.out.println("홀수 입니다.");
        } else {
            System.out.println("짝수 입니다.");
        }

        // Q3 substring을 사용해 주민등록번호를 YYYYMMDD 부분과 숫자 부분으로 나누어 출력
        String pin = "971125-12345567";
        String yyyymmdd = pin.substring(0, 6);
        String pinNum = pin.substring(7);
        System.out.println(yyyymmdd);
        System.out.println(pinNum);

        // Q4 주민등록번호 뒷자리의 첫번째 숫자로 성별을 출력해보자
        String pin1 = "971125-2234567";
        char pinNum1 = pin1.charAt(7);
        if (pinNum1 == '1') {
            System.out.println("남자입니다.");
        } else if (pinNum1 == '2') {
            System.out.println("여자입니다.");
        } else {
            System.out.println("사람이 아닙니다.");
        }

        // Q5 문자열 a:b:c:d를 replcat함수를 사용하여 a#b#c#d로 바꿔서 출력
        String x = "a:b:c:d";
        String y = x.replace(":", "#");
        System.out.println(y);

        // Q6 [1, 3, 5, 4, 2] 리스트를 [5, 4, 3, 2, 1]로 바꿔서 출력
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        list.sort(Comparator.reverseOrder());
        System.out.println(list);

        // Q7 ['Life', 'is', 'too', 'short'] 리스트를 Life is too short 문자열로 만들어 출력
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        String string = String.join(" ", myList);
        System.out.println(string);

        // Q8 맵 grade에서 "B"에 해당되는 값을 추출(추출 후에 "B"에 해당하는 value는 사라져야함.)
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);
        int result = grade.remove("B");
        System.out.println(result);
        System.out.println(grade);

        // Q9 numbers 리스트에서 중복 숫자를 제거
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        HashSet<Integer> temp = new HashSet<>(numbers); // List를 Set으로 변경
        System.out.println(numbers);
        System.out.println(temp); // 리스트 자료형에서 집합 자료형으로 변환 되면서 중복된 값들은 사라짐.
        ArrayList<Integer> res = new ArrayList<>(temp); // Set을 다시 List로 변경
        System.out.println(res); // [1, 2, 3, 4, 5]

        // Q10 커피의 가격을 알려주는 프로그램. 1,2,3과 같은 매직넘버를 제거하여 프로그램 계산
        // static void printCoffeePrice(CoffeeType type) {
        //     HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
        //     priceMap.put(CoffeeType.AMERICANO, 3000);  // 1: 아메리카노
        //     priceMap.put(CoffeeType.ICE_AMERICANO, 4000);  // 2: 아이스 아메리카노
        //     priceMap.put(CoffeeType.CAFE_LATTE, 5000);  // 3: 카페라떼
        //     int price = priceMap.get(type);
        //     System.out.println(String.format("가격은 %d원 입니다.", price));
        // }
        // printCoffeePrice(CoffeeType.AMERICANO);  // "가격은 3000원 입니다." 출력
    }
}
