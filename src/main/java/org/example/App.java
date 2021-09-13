/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Zarin Tasnim
 */

import java.util.Scanner;

class madlib{

    public static void main(String args[])
    {
        System.out.print("Enter a noun: ");
        Scanner sc = new Scanner(System.in);
        String noun = sc.nextLine();

        System.out.print("Enter a verb: ");
        String verb = sc.nextLine();

        System.out.print("Enter a adjective: ");
        String adjective = sc.nextLine();

        System.out.print("Enter a adverb: ");
        String adverb = sc.nextLine();

        System.out.println("Do you " + verb +" your " + adjective + " "+ noun +" " + adverb + "? That's hilarious!");


    }
}