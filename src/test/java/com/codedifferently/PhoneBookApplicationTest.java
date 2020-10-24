package com.codedifferently;

import java.io.Console;
import java.util.Scanner;

public class PhoneBookApplication {
    public static void main(String[] args){
        Console console = System.console();
        Scanner fred = new Scanner(System.in);
        console.printf("What is your name?");
        String name = fred.next();
        console.printf(" Your name is %s %n", name);
    }

}
