package Java.Method;

/*
public은 모든 곳에 사용 가능
private는 같은 클래스 내에서만 사용 가능
 */

class Greeting {
    public static void hi() {
        System.out.println("Hi");
    }
}

public class AccessLevelModifiersMethod {
    // public, protected, default, private

    public static void main(String[] args) {
        // private을 실행 시키려고 하면 에러 발생
        // private는 같은 클래스 내에서만 사용 가능
        Greeting.hi();
    }
}
