package com.training.array;

public class ArrayBehaviour {

    public void unidimensionalArray() {
        int[] array;
        array = new int[5];

        print1DArrayPositions(array);
        print1DArrayValues(array);

        int[] array2 = new int[] {0, 0, 0, 0, 0};

        print1DArrayPositions(array2);
        print1DArrayValues(array2);

        int[] array3 = {0, 0, 0, 0, 0};

        print1DArrayPositions(array3);
        print1DArrayValues(array3);
    }

    public void dimensionalArray() {
        int[][] array2d;
        array2d = new int[3][4];

        print2DArrayPositions(array2d);

        int[][] array2Abb = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};

        System.out.println();
        print2DArrayPositions(array2Abb);
    }

    public void print1DArrayPositions(final int[] array) {
        System.out.print("\n\nPosition:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("  " + i);
        }
    }

    public void print1DArrayValues(final int[] array) {
        System.out.print("\nValues:  ");
        for (int j : array) {
            System.out.printf("  " + j);
        }
    }

    public void print2DArrayPositions(final int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("\n\n");
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("(" + i + "," + j + ") ");
            }
        }
    }
}
