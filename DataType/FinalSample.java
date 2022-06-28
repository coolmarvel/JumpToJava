package DataType;

public class FinalSample {
    public static void main(String[] args) {
        String num = "123";
        int n = Integer.parseInt(num);
        System.out.println(n); // 123

        int n1 = 123;
        String num1 = "" + n1;
        System.out.println(num1); // 123

        String num2 = String.valueOf(n);
        String num3 = Integer.toString(n);
        System.out.println(num2); // 123
        System.out.println(num3); // 123

        String num4 = "123.456";
        double d = Double.parseDouble(num4);
        System.out.println(d); // 123.456

        double d1 = n1;  // 정수를 실수로 바꿀때에는 캐스팅이 필요없다.
        System.out.println(d1);  // 123.0 출력

        double d2 = 123.456;
        int n2 = (int) d2; // 실수를 정수로 바꿀때에는 반드시 정수형으로 캐스팅해 주어야 한다.
        System.out.println(n2);  // 소숫점이 생략된 123 출력

        // java의 final은 자료형에 값을 단 한번만 설정할 수 있게 강제하는 키워드.
        // 값을 한번 설정하면 그 값을 다시 설정할 수 없다는 말.

        // Unmodifiable List
        // 리스트의 경우 final로 선언시 리스트에 값을 더하거나 (add) 빼는 (remove) 것은 가능.
        // 다만 재할당만 불가능
        // 더하거나 빼는 것도 불가능하게 하고 싶은경우에는 List.of로 수정이 불가능한 리스트를 생성
    }
}
