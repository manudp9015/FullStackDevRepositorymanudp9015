package com.manu.test;


class TransposeMatrix
{
    static int[][] transpose(int a[][])
    {
        int rows = a.length;
        int cols = a[0].length;
        int b[][] = new int[cols][rows];
        for(int i = 0; i < b.length; i++)
        {
            for(int j = 0; j < b[i].length; j++)
            {
                b[j][i] = a[i][j];
            }
        }
        return b;
    }
}

public class Maindemo4 {
    static {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int res[][] = TransposeMatrix.transpose(a);
        for(int i = 0; i < res.length; i++)
        {
            for(int j = 0; j < res[i].length; j++)
            {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
    }
}
