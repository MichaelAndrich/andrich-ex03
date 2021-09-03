/*
 *  UCF COP3330 Fall 2021 Assignment 03 Solution
 *  Copyright 2021 Michael Andrich
 */

/*
    prompt user for a quote, store quote
    prompt user for the author of said quote and store author
    print author string along with the quote in quotation marks correctly
 */

import java.util.Scanner;

public class solution03 {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("What is the quote? ");

        String fquote = sc.nextLine();



        System.out.println("Who said it? ");

        String fauthor = sc.nextLine();



        System.out.println("" +fauthor+ " says, \""+fquote+ "\"");
    }
}

