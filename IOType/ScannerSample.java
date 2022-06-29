package IOType;

import java.util.Scanner;

public class ScannerSample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next());
        // Scanner 클래스는 생성자의 입력으로 System.in -> 즉, 콘솔입력인 InputStream을 필요로 함.
        // next() 메소드는 단어 하나(Token)를 읽어들인다.
        // nextLine() 문자열
        // nextInt() 정수
        sc.close();
    }
}
