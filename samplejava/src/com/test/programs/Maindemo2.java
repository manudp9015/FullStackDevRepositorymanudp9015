package com.test.programs;

class LaptopBrands {
    static String getBrand() {
        return "Dell";
    }
}

public class Maindemo2 
{
    public static void main(String[] args)
    {
        String brand = LaptopBrands.getBrand();
        System.out.println(brand);
    }
}

