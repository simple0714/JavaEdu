package Edu.innerClass;

public class innerClass {
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        Mammal.Whale whale = mammal.new Whale();
        whale.info();

        Mammal.Whale whale2 = new Mammal().new Whale();
        whale2.info();
    }
}

class Mammal {
    String birth = "출산";

    class Whale {
        String name = "고래";
        static String color = "회색";

        //자바 언어 사양상 컴파일 에러 발생
        //주의 : 컴파일러에 따라 특정 설정하에 동작 할 수도 있으나, static 사용하지 않기
        static int age = 18;

        public void info() {
            System.out.println(birth);
            System.out.println(name);
            System.out.println(color);
        }

    }
}