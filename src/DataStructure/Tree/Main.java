package DataStructure.Tree;

/*
입력

3
13 12
1 2 1 3 2 4 3 5 3 6 4 7 7 12 5 9 5 8 6 11 6 10 11 13
10 9
1 2 1 3 3 4 4 5 5 6 6 7 7 8 8 9 9 10
50 49
31 7 2 17 27 32 14 30 1 21 45 26 44 27 39 11 26 3 48 6 3 44 2 49 42 13 48 8 23 33 11 10 8 42 41 31 17 4 8 22 25 23 21 41 28 25 13 16 46 2 31 35 42 19 32 18 27 50 45 15 28 20 46 28 44 40 40 5 15 48 9 34 1 46 17 29 35 36 21 45 14 37 23 14 6 39 11 9 19 24 26 47 16 38 40 12 47 43
 */

import java.util.Scanner;

class Tree {
    static final int MAX_CHILD_NUM = 2;

    class TreeNode {
        int parent;
        int []child = new int[MAX_CHILD_NUM];
        public TreeNode(int parent) {
            this.parent = parent;
            for (int i = 0; i < MAX_CHILD_NUM; i++) {
                child[i] = -1;
            }
        }
    }

    TreeNode []treenode;
    int nodeNum;

    public Tree(int nodeNum) {
        this.nodeNum = nodeNum;
        treenode = new TreeNode[nodeNum + 1];
        for (int i = 0; i <= nodeNum; i++) {
            treenode[i] = new TreeNode(-1);
        }
    }
    
    public void addChild(int parent, int child) {
        int found = -1;
        for (int i = 0; i < MAX_CHILD_NUM; i++) {
            if (treenode[parent].child[i] == -1) {
                found = i;
                break;
            }
        }
        if (found == -1) return;

        treenode[parent].child[found] = child;
        treenode[child].parent = parent;
    }

    public int getRoot() {
        for (int i = 1; i < nodeNum; i++) {
            if (treenode[i].parent == -1) {
                return i;
            }
        }
        return -1;
    }

    public void preOrder(int root) {
        System.out.printf("%d ", root);
        for (int i = 0; i < MAX_CHILD_NUM; i++) {
            int child = treenode[root].child[i];
            if (child != -1) {
                preOrder(child);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int node = sc.nextInt();
            int edge = sc.nextInt();

            Tree tree = new Tree(node);

            for (int i = 0; i < edge; i++) {
                int parent = sc.nextInt();
                int child = sc.nextInt();
                tree.addChild(parent, child);
            }
            int root = tree.getRoot();
            System.out.printf("#%d ", test_case);
            tree.preOrder(root);
            System.out.printf("\n");
        }
        sc.close();
    }


}
