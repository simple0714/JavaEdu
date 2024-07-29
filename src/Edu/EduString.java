package Edu;

import java.util.Scanner;

public class EduString {
    public static void main(String[] args) {
        String str1 = "안녕";
        String str2 = "안녕";

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

        String str3 = "자바";
        str3 = "PHP";

        String str4 = "안녕하세요. 자바입니다.";

        // charAt()
        System.out.println(str4.charAt(3));

        // format()
        System.out.println(String.format("%s : 비밀번호 오류", "E10"));

        // equals()
        System.out.println(str1.equals(str2));

        // length()
        System.out.println(str4.length());

        // replace()
        String temp = str4.replace("자바", "PHP");
        System.out.println(temp);

        // join()
        String[] stringArr = {"자바", "PHP" , "C#"};
        System.out.println(String.join("/", stringArr));

        // toLowerCase(), toUpperCase()
        String caseStr = "ASDwdd";
        System.out.println(caseStr.toUpperCase());
        System.out.println(caseStr.toLowerCase());

        // ----------------------------------------------------------------
        // StringBuffer Class / StringBuilder Class
        StringBuffer sb = new StringBuffer("안녕 자바!");
        System.out.println(sb.toString());

        sb.append(" 안녕 PHP!");
        System.out.println(sb.toString());


//        Abc abc = new Abc();
//        System.out.println(abc);



        // Math class 메소드

        int num1 = -5;
        // 절대값
        System.out.println(Math.abs(num1));
        // 올림
        System.out.println(Math.ceil(2.56));
        // 내림
        System.out.println(Math.floor(2.56));
        // 반올림
        System.out.println(Math.round(2.56));
        // Random
        System.out.println(Math.random());

        // 1~10까지 랜덤 숫자 획득
        // printf를 사용하는 방법
        System.out.printf("%.0f\n", Math.random()*10);
        System.out.println(Math.floor(Math.random() + 1));
        System.out.println((int)(Math.random()*10) + 1);

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.printf("입력하신 값은 %s입니다.\n",input);

    }
}
class Abc {
    @Override
    public String toString() {
        return "abc";
    }
}
