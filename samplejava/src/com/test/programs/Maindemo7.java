package com.test.programs;

class Table
{
    int sumTable(int[] table) 
    {
        int sum = 0;
        for (int value : table) 
        {
            sum += value;
        }
        return sum;
    }
}

public class Maindemo7
{
    public static void main(String[] args)
    {
        int[] secondTable = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        Table o = new Table();
        int sum = o.sumTable(secondTable);
        System.out.println(sum);
    }
}
