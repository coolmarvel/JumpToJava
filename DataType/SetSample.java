// package DataType;

// import java.util.Arrays;
// import java.util.HashSet;

// public class SetSample {
//     public static void main(String[] args) {
//         HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
//         System.out.println(set); // [e, H, l, o]
//         // Set 자료형에는 HashSet, TreeSet, LinkedSet 등의 인터페이스를 구현한 자료형이 있음.
//         // 집합 자료형의 특징
//         // 중복을 허용하지 않음. 순서가 없음(Unordered)

//         HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
//         HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

//         // 교집합
//         HashSet<Integer> intersection = new HashSet<>(s1); // s1으로 intersection 생성
//         intersection.retainAll(s2); // 교집합 수행
//         System.out.println(intersection); // [4, 5, 6]

//         // 합집합
//         HashSet<Integer> substract = new HashSet<>(s1); // s1으로 substract 생성
//         substract.remove(s2); // 합집합 수행
//         System.out.println(substract); // [1, 2, 3, 4, 5, 6]

//         HashSet<String> set1 = new HashSet<>();
//         set1.add("Jump");
//         set1.add("To");
//         set1.add("Java");
//         System.out.println(set1); // [Java, To, Jump]

//         HashSet<String> set2 = new HashSet<>();
//         set2.add("Jump");
//         set2.addAll(Arrays.asList("To", "Java"));
//         System.out.println(set2); // [Java, To, Jump]

//         HashSet<String> set3 = new HashSet<>(Arrays.asList("Jump", "To", "Java"));
//         set3.remove("To");
//         System.out.println(set3); // [Java, Jump] 출력
//     }
// }
