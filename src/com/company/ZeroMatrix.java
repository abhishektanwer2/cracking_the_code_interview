package com.company;

public class ZeroMatrix {
    public static void main(String[] args) {
        int matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 0},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        implementZeroMatrix(matrix);
        printMatrix(matrix);

    }

    private static void implementZeroMatrix(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] columns = new boolean[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    columns[j] = true;
                }
            }
        }

        for (int i = 0; i < rows.length; i++) {
            if (rows[i] == true) {
                nullifyRow(matrix, i);
            }
        }
        for (int i = 0; i < columns.length; i++) {
            if (columns[i] == true) {
                nullifyColumn(matrix, i);
            }
        }

    }

    private static void nullifyColumn(int[][] matrix, int column) {
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[i][column] = 0;
        }
    }

    private static void nullifyRow(int[][] matrix, int row) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[row][i] = 0;
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