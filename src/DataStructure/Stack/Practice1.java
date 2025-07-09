package DataStructure.Stack;

// 주어진 N개의 수를 순서대로 Stack에 넣은 후 하나씩 꺼내 화면에 출력
// N의 범위 (2 <= N <= 100)
/*
입력
2 // 테스트 케이스 수
5 // 데이터 크기
1 2 3 4 5
5
5 4 2 3 1

출력
#1 5 4 3 2 1
#2 1 3 2 4 5
 */

import java.io.IOException;
import java.util.Scanner;

public class Practice1 {

    static final int MAX_N = 100;

    static int top;
    static int stack[] = new int[MAX_N];

    static void stackInit() {
        top = 0;
    }

    static boolean stackIsEmpty() {
        return (top == 0);
    }

    static boolean stackIsFull() {
        return (top == MAX_N);
    }

    static boolean stackPush(int value) {
        if (stackIsFull()) {
            System.out.println("stack overflow!");
            return false;
        }
        stack[top] = value;
        top++;

        return true;
    }

    static Integer stackPop() {
        if (top == 0) {
            System.out.println("stack is empty!");
            return null;
        }

        top--;
        Integer value = Integer.valueOf(stack[top]);

        return value;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();

            stackInit();
            for (int i = 0; i < N; i++) {
                int value = sc.nextInt();
                stackPush(value);
            }

            System.out.println("#" + test_case + " ");

            while (!stackIsEmpty()) {
                Integer value = stackPop();
                if (value != null) {
                    System.out.print(value.intValue() + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
