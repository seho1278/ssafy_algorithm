package Algorithm.Recursion;

// 주어진 수의 Factorial 값을 구해 출력하기
/*
입력
3 // 전체 Test case 수
9 // Test case index
12
20

출력
#1 9! = 362880
#2 12! = 479001600
#3 20! = 2432902008176640000

 */

import java.util.Scanner;

public class Practice1 {
    static long factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int num = sc.nextInt();
            long value = factorial(num);
            System.out.println("#" + test_case + " " + num + "! = " + value);
        }

        sc.close();

    }
}
