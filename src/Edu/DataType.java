package Edu;

public class DataType {
    public static void main(String[] args) {
        boolean flg = true;

        byte numByte = 125;
        short numShort = 32767;
        int numInt = 1;
        long numLong = 1L; // long 타입은 숫자 + L(l)을 붙여야 한다

        double numDouble = 5.0;
        float numFloat = 5.0f; // float 타입은 숫자 + F(f)을 붙여야 한다

        char enChar = 'A'; //java에선 '' char이고  ""는 string이다.
        String str = "asd";

        // 연산자
        int num1 = 1;
        int num2 = 2;

        System.out.println(num1 == num2);
        System.out.println(num1 != num2);
        //java는 php랑 다르게 ===이 없고 ==만 있다.

        // 문자열 비교
        String str2 = "asd";
        String str3 = "asd";
        String str4 = "qwe";
        System.out.println(str2.equals(str3));
        System.out.println(str2.equals(str4));
    }
}
