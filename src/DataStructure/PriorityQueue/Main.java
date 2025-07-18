package DataStructure.PriorityQueue;

import java.util.Scanner;

/* input
2
10
10 49 38 17 56 92 8 1 13 55
13
4 22 50 13 5 1 22 35 21 7 99 100 14
 */

public class Main {
    static Scanner sc;

    static final int MAX_SIZE = 100;

    static int heap[] = new int[MAX_SIZE];
    static int heapSize = 0;

    static void heapInit() {
        heapSize = 0;
    }

    static void heapPush(int value) {
        if (heapSize + 1 > MAX_SIZE) {
            return;
        }

        heap[heapSize] = value;

        int current = heapSize;
        while (current > 0 && heap[current] < heap[(current - 1) / 2]) {
            int temp = heap[(current - 1) / 2];
            heap[(current - 1) / 2] = heap[current];
            heap[current] = temp;
            current = (current - 1) / 2;
        }

        heapSize = heapSize + 1;
    }

    static int heapPop() {
        if (heapSize <= 0) {
            return -1;
        }

        int value = heap[0];
        heapSize = heapSize - 1;

        heap[0] = heap[heapSize];

        int current = 0;

        while (current < heapSize && current * 2 + 1 < heapSize) {
            int child;
            if (current * 2 + 2 >= heapSize) {
                child = current * 2 + 1;
            } else {
                child = heap[current * 2 + 1] < heap[current * 2 + 2] ? current * 2 + 1 : current * 2 + 2;
            }

            if (heap[current] < heap[child]) {
                break;
            }

            int temp = heap[current];
            heap[current] = heap[child];
            heap[child] = temp;
        }
        return value;
    }

    static void heapPrint(int[] heap, int heap_size) {
        for (int i = 0; i < heap_size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();

            heapInit();

            for (int i = 0; i < N; i++) {
                int value = sc.nextInt();
                heapPush(value);
            }

            System.out.print("#" + test_case + " ");
            for (int i = 0; i < N; i++) {
                System.out.print(heapPop() + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
