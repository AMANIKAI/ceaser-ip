package org.example;

import java.io.Console;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner userInputObject = new Scanner(System.in);

        do {
            System.out.println("Select process (e-encode/d-decode:");
            String process = userInputObject.nextLine();

            System.out.println("Enter message:");
            String msg = userInputObject.nextLine();

            System.out.println("Enter key:");
            int key = userInputObject.nextInt();

            System.out.println("Processing...");
            System.out.println(process);
            if (process.startsWith("e")){
                String output = Encoding.encode(msg, key);
                System.out.println(output);
            } else if (process.startsWith("d")) {
                System.out.println("Decoding");
            } else {
                System.out.println("Invalid process");
                continue;
            }
            System.out.println("Do you want to quit or continue");
            String nextStep = userInputObject.nextLine();
            if (nextStep.startsWith("q")){
                break;
            }
        } while(true);


    }
}