package com.polymorphism;

abstract class Document 
{
    abstract void convert();
}

class WordDocument extends Document 
{
    void convert() 
    {
        System.out.println("word");
    }
}

class PDFDocument extends Document 
{
    void convert() 
    {
        System.out.println("pdf");
    }
}

public class Maindemo5 
{
    public static void main(String[] args) 
    {
        Document document;

        document = new WordDocument();
        document.convert();

        document = new PDFDocument();
        document.convert();

      
    }
}

