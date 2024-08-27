package com.assignment.String;

class DeleteDayString
{
    static String deleteEachOccurenceOfDay(String str)
    {
        String s1="";
        int start=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='D'&& str.charAt(i+1)=='A'&& str.charAt(i+2)=='Y')
            {
                s1+=str.substring(start,i)+" ";
                start=i+3;
                
            }
        }
        return s1;
    }
}
public class Maindemo5 {
    public static void main(String[] args) {
        String res=DeleteDayString.deleteEachOccurenceOfDay("SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY");
        System.out.println(res);
    }
}

