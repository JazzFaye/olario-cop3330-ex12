/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

import java.util.Scanner;   //Using class scanner

public class App {
    public static void main(String[] args){
        Scanner interest = new Scanner(System.in);  //Scanner to obtain input from the user

        System.out.println("Enter the principal: ");
        String P = interest.nextLine(); //Reads input from the user
        double principal = Double.parseDouble(P);   //Convert input from String to double

        System.out.println("Enter the rate of interest: ");
        String I = interest.nextLine(); //Reads input from the user
        double Interest = Double.parseDouble(I);    //Convert input from String to double

        System.out.println("Enter the number of years: ");
        String Y = interest.nextLine(); //Reads input from the user
        double years = Double.parseDouble(Y);   //Convert input from String to double

        double percent = Interest / 100;    //formula to prompt for the rate as a percentage
        double A = principal * (1 + (percent * years)); //Formula to get the amount at the end of the investment.

        //Display the number of years, percentage and the amount at the end of the investment.
        System.out.printf("After %.0f years at %.1f%%,the investment will be worth $%.0f.", years, Interest, A);

    }
}
