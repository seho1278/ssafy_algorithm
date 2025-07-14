package Algorithm.BinarySearch;

/*
입력

2
12
5
3 7 28 29 43 49 55 58 69 77 79 99
8 49 58 44 7
7
3
3 4 5 6 7 8 9
1 2 3
 */

import java.util.Scanner;

public class Main {
    static final int MAX_M = 100;

    static int T;
    static int M;
    static int N;
    static int arr[];

    static void binarySearch(int[] arr, int low, int high, int target) {
        int mid;

        if (low > high) {
            System.out.print("-1 ");
            return;
        }

        mid = (low + high) / 2;

        if (target < arr[mid]) {
            binarySearch(arr, low, mid - 1, target);
        } else if (arr[mid] < target) {
            binarySearch(arr, mid + 1, high, target);
        } else {
            System.out.print(mid + " ");
            return;
        }
    }

    public static void main(String[] args) throws Exception  {
        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            System.out.print("#" + test_case + " ");

            M = sc.nextInt();
            N = sc.nextInt();

            arr = new int[M];
            for (int i = 0; i < M; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < N; i++) {
                int targetValue = sc.nextInt();
                binarySearch(arr, 0, M - 1, targetValue);
            }
            System.out.println();
        }
        sc.close();
    }
}
