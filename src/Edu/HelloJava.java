package Edu;

public class HelloJava {
    public static void main(String[] args) {
//        System.out.println("Hello World");

        // 변수
        int num = 1;

        // 상수
        final int num2 = 2;
//        num2 = 1; //상수이기 때문에 재할당이 불가능

        // 스왑
        int swap1 = 10;
        int swap2 = 30;

        int temp = swap1;

        swap1 = swap2;
        swap2 = temp;

//        System.out.println(swap1);
//        System.out.println(swap2);
        System.out.printf("swap1 = %d%n, swap2 = %d", swap1, swap2);


    }
}
