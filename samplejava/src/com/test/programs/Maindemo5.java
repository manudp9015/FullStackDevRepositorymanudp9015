package com.test.programs;

class VotingEligibility
{
    static boolean isEligible(int age) 
    {
        return age >= 18;
    }
}

public class Maindemo5 
{
    public static void main(String[] args) 
    {
       
        boolean eligible = VotingEligibility.isEligible(20);
        if (eligible) {
            System.out.println(" eligible for voting.");
        } 
        else 
        {
            System.out.println("eligible for voting.");
        }
    }
}
