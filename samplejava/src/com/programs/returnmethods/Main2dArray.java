package com.programs.returnmethods;

class Array2d 
{
   
    int[] firstrow(int x[][]) 
    {
        int[] res = new int[x[0].length];
        for (int j = 0; j < x[0].length; j++)
        {
            res[j] = x[0][j];
        }
        return res; 
    }
}

public class Main2dArray 
{
    public static void main(String[] args) 
    {
        int a[][] = {{10, 20, 30}, {40, 50, 60}};
        Array2d o1 = new Array2d();
        int[] res = o1.firstrow(a); 
        
        for (int i = 0; i < res.length; i++) 
        {
            System.out.print(res[i] + " ");
        }
    }
}
