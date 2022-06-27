package DataType;

import java.util.HashMap;

public class MapSample {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map.get("people")); // 사람

        System.out.println(map.containsKey("people")); // true

        System.out.println(map.size()); // 2

        System.out.println(map.keySet()); // [baseball, people]

        System.out.println(map.remove("people")); // 사람

        // Map의 특징 -> 순서에 의존하지 않고 key로 value를 가져옴.
        // 입력된 순서대로 혹은 입력된 key에 의해 sort된 데이터를 가져오고 싶을 때
        // LinkedHashMap, TreeMap을 사용
        // LinkedHashMap : 입력된 순서대로 데이터를 저장하는 특징
        // TreeMap : 입력된 key의 오름차순으로 데이터를 저장하는 특징
    }
}
