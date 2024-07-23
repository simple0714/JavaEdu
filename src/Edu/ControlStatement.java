package Edu;

public class ControlStatement {
    public static void main(String[] args) {
//        if(조건1) {
//
//        } else if(조건2) {
//
//        } else {
//
//        }

        //switch 문
        String food = "뚝배기";
        switch (food) {
            case "김밥" :
                System.out.println("분식");
                break;
            case "뚝배기" :
                System.out.println("한식");
                break;
            default:
                System.out.println("기타");
                break;
        }

        //for문
        for(int i = 0; i < 3; i++){
            if( i == 1) {
                break;
            }
            System.out.println(i);
        }

        //구구단 출력
        for(int i = 2; i < 10; i++){
            System.out.println(i+"단");
            for(int g = 1; g < 10; g++) {
//                System.out.println(i + "x" + g + "=" + (i*g));
                System.out.printf("%dx%d=%d%n", i, g, i*g);
            }
        }

        //     *
        //    **
        //   ***
        //  ****
        // *****

        int starCount = 5;
        int spaceCount = 3;

        for (int i = 0; i < starCount; i++) {
            //공백
            for (int j = spaceCount; j >= i; j--) {
                System.out.print(" ");
            }
            //*
            for (int k = 0; k < i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        int startPoint = 1;
        int sum = 0;
        while (startPoint <= 100) {
            sum+=startPoint;
            startPoint++;
        }
        System.out.println("1부터 100까지의 합은" + sum + "입니다");
        System.out.printf("1부터 100까지의 합은%d입니다.", sum);
    }
}
