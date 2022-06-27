package DataType;

public class StringSample {
    public static void main(String[] args) {
        // literal 표기
        // 문자열을 intern pool이라는 곳에 저장하고 선언될 때 cache된 문자열을 리턴
        String a = "Happy Java";
        String b = "a";
        String c = "123";

        // 항상 새로운 String 객체를 만듬.
        String a1 = new String("Happy Java");
        String b1 = new String("a");
        String c1 = new String("123");

        System.out.println(a); // Happy Java
        System.out.println(b); // a
        System.out.println(c); // 123
        System.out.println(a1); // Happy Java
        System.out.println(b1); // a
        System.out.println(c1); // 123

        // 원시(primitive) 자료형 -> new 키워드로 객체 생성 불가
        // int, long, double, float, boolean, char

        // 원시 자료형의 Wrapper 클래스
        // Integer, Long, Double, Float, Boolean, Char
        // ArrayList, HashMap, HastSet 등은 Wrapper 클래스를 사용하여 값 대신 객체를 주고 받을 수 있다.

        String q = "hello";
        String w = "java";
        String e = "hello";
        System.out.println(q.equals(w)); // false
        System.out.println(q.equals(e)); // true

        String z = new String("hello");
        System.out.println(q.equals(z)); // true
        System.out.println(q == z); // false

        // indexOf -> 문자열에서 특정 문자가 시작되는 위치(index)를 리턴
        System.out.println(a.indexOf("Java")); // 6

        // contains -> 문자열에 포함되어 있는지 여부 boolean 리턴
        System.out.println(a.contains("Java")); // true

        // charAt -> 문자열에서 특정 위치의 문자(char)를 리턴
        System.out.println(a.charAt(6)); // J

        // replaceAll -> 문자열 중 특정 문자열을 다른 문자열로 바꾸고자 할 때 사용
        System.out.println(a.replaceAll("Java", "World")); // Happy World

        // substring -> 문자열 중 특정 부분을 뽑아낼 경우 사용
        System.out.println(a.substring(0, 4)); // Happ

        // toUpperCase -> 문자열을 모두 대문자로 변경(소문자는 toLowerCase)
        System.out.println(a.toUpperCase()); // HAPPY JAVA
        System.out.println(a.toLowerCase()); // happy java

        // split -> 문자열을 특정 구분자로 분리하는 메소드
        String x = "a:b:c:d";
        String[] result = x.split(":");
        System.out.println(result); // {"a", "b", "c", "d"}

        // String Formatting
        System.out.println(String.format("I eat %d apples.", 3)); // I eat 3 apples.
        System.out.println(String.format("I eat %s apples.", "five")); // I eat five apples.
        int number = 3;
        System.out.println(String.format("I eat %d apples.", number)); // I eat 3 apples.
        int num = 10;
        String day = "three";
        System.out.println(String.format("I ate %d apples. so I was sick for %s days.", num, day));
        // I ate 10 apples. so I was sick for three days.
        // %s문자열(String), %c문자1개(character), %d정수(Integer), %f부동소수(floating-point)
        System.out.println(String.format("%10s", "hi")); //           hi
        System.out.println(String.format("%-10sjane.", "hi")); // hi          jane.
        System.out.println(String.format("%.4f", 3.1423156)); // 3.1423
        // println
        System.out.println(String.format("I eat %d apples.", 3)); // I eat 3 apples.
        // printf
        System.out.printf("I eat %d apples.",3); // I eat 3 apples.
        // String.format 메소드 없이도 동일한 형식으로 포매팅된 문자열 출력
        // 차이는 전자는 문자열을 '리턴'하는 메소드, 후자는 문자열을 '출력'하는 메소드
    }
}
