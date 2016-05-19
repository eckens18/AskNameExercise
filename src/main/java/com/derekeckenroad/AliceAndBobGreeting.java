package com.derekeckenroad;

import java.util.Scanner;

/**
 * Created by derekeckenroad on 5/19/16.
 */
public class AliceAndBobGreeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        if(name.equals("Alice")|| name.equals("Bob")){
            System.out.println("Hello "+name);
        } else {
            System.out.println("Hello there!");
        }

    }
}
