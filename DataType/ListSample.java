package DataType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ListSample {
    public static void main(String[] args) {
        ArrayList pitches = new ArrayList<>();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");

        System.out.println(pitches.get(1));
        System.out.println(pitches.size());
        System.out.println(pitches.contains("142"));

        // Generics
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>(Arrays.asList("123", "456", "789"));
        // ArrayList 안에 담을 수 있는 자료형은 String 타입뿐이다. 라고 정의
        // <Integer>, <Animal>, <Dog> 등 어떠한 자료형도 사용 가능
        // 형변환 과정이 필요가 없다.
        System.out.println(a);
        System.out.println(b);

        String result = "";
        for (int i = 0; i < b.size(); i++) {
            result += b.get(i);
            result += ",";
        }
        result = result.substring(0, result.length() - 1);
        System.out.println(result);

        String res = String.join(",", b);
        System.out.println(res);

        // 리스트 정렬하기
        b.sort(Comparator.naturalOrder()); // 오름차순(순방향)
        System.out.println(b);
        b.sort(Comparator.reverseOrder()); // 내림차순(역방향)
        System.out.println(b);
    }
}
