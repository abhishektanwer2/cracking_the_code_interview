package com.company;

public class RotateMatrix {
    public static void main(String[] args) {
        int N = 4;
        int matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        printMatrix(matrix);
        System.out.println("after rotation ");

        rotateMatrix90clockwise(matrix, N);
        printMatrix(matrix);

    }

    private static void rotateMatrix90clockwise(int[][] matrix, int n) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return;
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - first;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last - offset][first];
                matrix[last - offset][first] = matrix[last][last - offset];
                matrix[last][last - offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }


    }

    public static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {

                System.out.print(anInt + " ");

            }
            System.out.println();
        }
    }
}
