package Java.FlowControl;

public class AuthApp3 {
    public static void main(String[] args) {
//        String[] users = {"egoing", "jinhuck", "youbin"};
        String[][] users = {
                {"egoing", "1111"},
                {"jinhuck", "2222"},
                {"youbin", "3333"}
        };
        String inputId = args[0];
        String inputPassword = args[1];

        boolean isLogined = false;
        for (int i = 0; i < users.length; i++) {
            String[] current = users[i];
            if (
                    current[0].equals(inputId) &&
                    current[1].equals(inputPassword)
            ) {
                isLogined = true;
                break;
            }
        }
        System.out.println("Hi, ");
        if (isLogined) {
            System.out.println("Master!!");
        } else {
            System.out.println("Who are you?");
        }
    }

}
