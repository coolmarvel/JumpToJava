package OOP;

public class MethodSample {
    int sum(int a, int b) {
        return a + b;
    }

    String say() {
        return "hi";
    }

    // void 함수 return값 없는 메소드
    void sayNick(String nick) {
        if ("fool".equals(nick)) {
            return;
        }
        System.out.println("나의 별명은 " + nick + " 입니다.");
    }

    void varTest(int a) {
        a++;
    }

    public void varTest1(int b) {
        b++;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        MethodSample sample = new MethodSample();
        int c = sample.sum(a, b);
        String d = sample.say();

        System.out.println(c);
        System.out.println(d);

        sample.sayNick("angel");
        sample.sayNick("fool"); // 출력되지 않는다.

        sample.varTest(a);
        System.out.println(a);
    }
}
