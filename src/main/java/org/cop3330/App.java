/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Justin Parrondo
 */

package org.cop3330;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your age? ");
        int age = in.nextInt();
        System.out.println(age >= 16 ? "You are old enough to legally drive." : "You are not old enough to legally drive.");
    }
}
