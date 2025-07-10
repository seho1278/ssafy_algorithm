package Algorithm.InsertionSort;

import java.util.Scanner;

public class Practice1 {
    static int input[];
    static int num;

    static void insertionSort() {
        for (int i = 0; i < num; i++) {
            int temp = input[i];
            int j = i - 1;
            while ((j >= 0) && (temp < input[j])) {
                input[j + 1] = input[j];
                j = j - 1;
            }
            input[j + 1] = temp;
        }
    }

    static void printResult() {
        int i;

        for (i = 0; i < num; ++i) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            num = sc.nextInt();

            input = new int[num];
            for (int i = 0; i < num; i++) {
                input[i] = sc.nextInt();
            }

            insertionSort();

            System.out.print("#" + test_case + " ");
            printResult();
        }
        sc.close();
    }
}
