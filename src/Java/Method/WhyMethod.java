package Java.Method;

public class WhyMethod {
    public static void main(String[] args) {
        // 1000000000
        printTwoTimes("a", "-");
        // 1000000000
        printTwoTimes("a", "*");
        // 1000000000
        printTwoTimes("a", "&");
        printTwoTimes("a", "!");
    }

    public static void printTwoTimes(String text, String delimiter) {
        System.out.println(delimiter);
        System.out.println(text);
        System.out.println(text);
    }
}
