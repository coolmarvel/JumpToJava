package IOType;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputSample {
    public static void main(String[] args) throws IOException {

        byte[] b = new byte[1024];
        FileInputStream input = new FileInputStream("C:/Users/이성현/Desktop/out.txt");
        input.read(b);
        System.out.println(new String(b)); // byte 배열을 문자열로 변경하여 출력
        input.close();

        BufferedReader br = new BufferedReader(new FileReader("C:/Users/이성현/Desktop/out.txt"));
        while (true) {
            String line = br.readLine();
            if (line == null)
                break; // 더 이상 읽을 라인이 없을 경우 while 문을 빠져나간다.
            System.out.println(line);
        }
        // FileInputStream 대신 FileReader와 BufferedReader의 조합을 사용하면 라인단위로 파일을 읽을 수 있다.
        // BufferedReader의 readLine 메소드는 더이상 읽을 라인이 없을 경우 null을 리턴한다.
        br.close();
    }
}
