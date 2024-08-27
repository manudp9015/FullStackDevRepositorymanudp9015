package com.test.programs;

class Array8
{
    byte[] getByteArray() 
    {
        byte[] byteArray = {10, 20, 30, 40, 50};
        return byteArray;
    }
}

public class Maindemo8 
{
    public static void main(String[] args) 
    {
        Array8 provider = new Array8();
        byte[] byteArray = provider.getByteArray();
        for (byte b : byteArray) {
            System.out.print(b);
        }
    }
}
