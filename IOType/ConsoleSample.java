package IOType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ConsoleSample {
    // IOException
    // InputStream으로 부터 값을 읽어들일 때는 IOException이 발생할 수 있기 때문에
    // 예외처리를 해야하는데 thorws로 그 예외처리를 뒤로 미루게 한 것이다.
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        // int a;
        // a = in.read();
        // System.out.println(a);
        // InputStream의 메소드 read는 1byte만 읽기 때문에
        // a를 읽든 abc를 읽든 97 아스키코드를 뱉는다.
        // 스트림(Stream)은 이어여 있는 데이터(byte)의 형태를 의미한다.

        // byte[] a = new byte[3];
        // in.read(a);

        // System.out.println(a[0]);
        // System.out.println(a[1]);
        // System.out.println(a[2]); // 97 98 99

        InputStreamReader reader = new InputStreamReader(in);
        // char[] a = new char[3];
        // reader.read(a);
        // System.out.println(a); // abc(input) abc(output)

        BufferedReader br = new BufferedReader(reader);
        String a = br.readLine();
        System.out.println(a); // Hello World(input) Hello World(output)

        // InputStream - byte
        // InputStreamReader - character
        // BufferedReader - String

    }
}
