package DataType;

public class EnumSample {
    enum CoffeeType {
        AMERICANO, ICE_AMERICANO, CAFE_LATTE
    };

    public static void main(String[] args) {
        System.out.println(CoffeeType.AMERICANO); // AMERICANO
        System.out.println(CoffeeType.ICE_AMERICANO); // ICE_AMERICANO
        System.out.println(CoffeeType.CAFE_LATTE); // CAFE_LATTE

        for (CoffeeType type : CoffeeType.values()) {
            System.out.println(type); // 순서대로 AMERICANO, ICE_AMERICANO, CAFE_LATTE 출력
        }

        // 프로그래밍에서 상수로 선언하지 않은 숫자를 매직넘버라고 한다.
    }
}
