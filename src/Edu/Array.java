package Edu;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println(arr);

        // 1 ~ 100,000의 숫자를 배열로 만들어 주세요
        int[] arr2 = new int[100000];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
//        System.out.println(Arrays.toString(arr2));

        //캐릭터 배열
        char[] arr3 = {'a', 'b', 'c'};
        System.out.println(Arrays.toString(arr3));

        //배열 사용 주의 사항
//        int[] arr4 = {1, 2, 3};
//        int[] arr5 = arr4;
//        arr5[1] = 43;
//        System.out.println(Arrays.toString(arr5));
//        System.out.println(Arrays.toString(arr4));
        int[] arr4 = {1, 2, 3};
//        int[] arr5 = new int[arr4.length];
//        for (int i = 0; i < arr5.length; i++) {
//            arr5[i] = i + 1;
//        }


        //Arrays.copyOf() 메소드 사용
        int[] arr5 = Arrays.copyOf(arr4, arr4.length);
        arr5[1] = 43;
        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.toString(arr4));

        //다차원 배열
        int[][] arr6 = {
                {1, 2, 3}
                ,{4, 5, 6}
                ,{7, 8, 9}
        };
        System.out.println(arr6[1][1]);

        int[] arr7 = {5, 76, 2, 4, 1, 6, 33};

        int a = arr7.length;
        for (int i = 0; i < a - 1; i++) {
            for (int j =0; j < a - 1; j++) {
                if(arr7[j] > arr7[j+1] ) {
                    int temp = arr7[j];
                    arr7[j] = arr7[j+1];
                    arr7[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr7));


        int[] arr8 = {5, 76, 2, 4, 1, 6, 33};
        int[] b = arr8;

        boolean flag;
        int pass = 0;
        do{
            flag = false;
            pass++;

            for (int i = 0; i < b.length-pass; i++) {
                if(b[i] > b[i+1]){
                    b[i] = b[i] ^ b[i+1];
                    b[i+1] = b[i+1] ^ b[i];
                    b[i] = b[i] ^ b[i+1];

                    flag = true;
                }
                System.out.print(i);
            }
            System.out.println(Arrays.toString(arr8));
        }
        while(flag);
    }
}
