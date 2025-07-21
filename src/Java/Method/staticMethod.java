package Java.Method;

/*
static - class method
no static - instance method
 */

class Print {
    public String delimiter;

    public void a() {
        // t1에서 지정한 값
        System.out.println(this.delimiter);
        System.out.println("a");
        System.out.println("a");
    }

    public void b() {
        // t2에서 지정한 값
        System.out.println(this.delimiter);
        System.out.println("b");
        System.out.println("b");
    }

    public static void c(String delimiter) {
        System.out.println(delimiter);
        System.out.println("c");
        System.out.println("c");
    }
}

public class staticMethod {
    public static void main(String[] args) {
//        Print.a("-");
//        Print.b("-");

        // Print 클래스의 분신(instance)
        Print t1 = new Print();
        t1.delimiter = "-";
        t1.a();
        t1.b();
        t1.c("-");

//        Print.a("*");
//        Print.b("*");

        Print t2 = new Print();
        t2.delimiter = "*";
        t2.a();
        t2.b();
        t2.c("*");

    }

}
