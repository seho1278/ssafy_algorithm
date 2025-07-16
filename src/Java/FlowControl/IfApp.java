package Java.FlowControl;

// 조건문

public class IfApp {
    public static void main(String[] args) {
        System.out.println("a");
        if (false) {
            // dead code 영원히 실행될 수 없는 코드
            System.out.println(1);
        } else if (true) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
        System.out.println("b");
    }
}
