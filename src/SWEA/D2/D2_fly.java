package SWEA.D2;

/*
파리 퇴치3

입력

2
5 2
1 3 3 6 7
8 13 9 12 8
4 16 11 12 6
2 4 1 23 2
9 13 4 7 3
6 3
29 21 26 9 5 8
21 19 8 0 21 19
9 24 2 11 4 24
19 29 1 0 21 19
10 29 6 18 4 3
29 11 15 3 3 29
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D2_fly {
    static int N;
    static int M;
    static int[][] graph;

    public static int spray(int[][] graph, int power) {
        // 죽일 수있는 파리 수
        int max = 0;
        int N = graph.length;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int plusShape = graph[i][j];  // + 모양 중심 포함
                int crossShape = graph[i][j]; // x 모양 중심 포함

                // + 모양
                for (int k = 1; k < power; k++) {
                    if (i - k >= 0) plusShape += graph[i - k][j]; // 위
                    if (i + k < N) plusShape += graph[i + k][j]; // 아래
                    if (j - k >= 0) plusShape += graph[i][j - k]; // 왼쪽
                    if (j + k < N) plusShape += graph[i][j + k]; // 오른쪽
                }

                // x 모양
                for (int k = 1; k < power; k++) {
                    if (i - k >= 0 && j - k >= 0) crossShape += graph[i - k][j - k];
                    if (i - k >= 0 && j + k < N) crossShape += graph[i - k][j + k];
                    if (i + k < N && j - k >= 0) crossShape += graph[i + k][j - k];
                    if (i + k < N && j + k < N) crossShape += graph[i + k][j + k];
                }
                // 둘 중 최대값을 max에 반영
                max = Math.max(max, Math.max(plusShape, crossShape));
            }
        }

        return max;
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            graph = new int[N][N];
            for (int i = 0; i < graph.length; i++) {
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                for (int j = 0; j < graph[i].length; j++) {
                    graph[i][j] = Integer.parseInt(st1.nextToken());
                }
            }

            System.out.println("#" + test_case + " " + spray(graph, M));
        }
    }
}
