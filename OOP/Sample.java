package OOP;

class Calculator {

    static int result = 0;

    static int add(int num) {
        result += num;
        return result;
    }

    int sub(int num) {
        result -= num;
        return result;
    }
}

class Animal {
    String name;

    public void setName(String name) {
        this.name = name;
    }
}

public class Sample {

    public static void main(String[] args) {
        Calculator cal1 = new Calculator(); // 계산기1 객체를 생성한다.
        Calculator cal2 = new Calculator(); // 계산기2 객체를 생성한다.

        // System.out.println(cal1.add(3));
        // System.out.println(cal1.add(4));

        // System.out.println(cal2.add(3));
        // System.out.println(cal2.add(7));

        Animal cat = new Animal();
        cat.setName("coco");
        Animal dog = new Animal();
        dog.setName("happy");

        System.out.println(cat.name);
        System.out.println(dog.name);
    }
}