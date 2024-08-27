package com.test.programs;

class Bird
{
    String[] getBirdNames() 
    {
        return new String[] {"Sparrow", "Eagle", "Parrot"};
    }
}

public class Maindemo11 
{
    public static void main(String[] args) 
    {
        Bird provider = new Bird();
        String[] birdNames = provider.getBirdNames();
        
        for (String bird : birdNames) 
        {
            System.out.print(bird + " ");
        }
    }
}
