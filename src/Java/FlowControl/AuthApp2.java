package Java.FlowControl;

/*
 primitive 원시타입 - 더이상 쪼갤 수 없는 데이터 타입
 boolean, int, double ...

 non primitive
 String, Array, Data ...
 
 구분하는 이유
 원시 데이터 타입과 아닌것들을 Java는 차별한다.

 */



public class AuthApp2 {
    public static void main(String[] args) {
        String id = "egoing";
        String inputId = args[0];

        String pass = "1111";
        String pass2 = "2222";
        String inputPass = args[1];

        System.out.println("Hi.");
        boolean isRightPass = (inputPass.equals(pass) || inputPass.equals(pass2));
        if (inputId.equals(id) && isRightPass) {
            System.out.println("Master!");
        } else {
            System.out.println("Who are you?");
        }
    }
}
