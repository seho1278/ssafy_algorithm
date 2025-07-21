package SWEA.D2;

/*
최대수 구하기

10개의 수를 입력 받아, 그 중에서 가장 큰 수를 출력

각 수는 0 이상 10000 이하의 정수

입력

3
3 17 1 39 8 41 2 32 99 2
22 8 5 123 7 2 63 7 3 46
6 63 2 3 58 76 21 33 8 1
 */

import java.util.Scanner;

public class D1_2068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < 10; i++) {
                int num = sc.nextInt();
                if (max < num) {
                    max = num;
                }
            }
            System.out.println("#" + test_case + " " + max);
        }
    }
}
