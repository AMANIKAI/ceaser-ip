package org.example;


import java.util.Scanner;

public class App {
    private String process;
    private String message;
    private int key;

    public void setProcess(String process) {
        this.process = process;
    }

    public String getProcess() {
        return process;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public static void main(String[] args) {
        Scanner userInputObject = new Scanner(System.in);
        App mainObject = new App();

        do {
            System.out.println("Select the Process: (e-encode/d-decode:");
            mainObject.setProcess(userInputObject.nextLine());

            System.out.println("Enter Your Message:for Encoding; THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG\n" +
                    "Decoding; QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD");
            mainObject.setMessage(userInputObject.nextLine());

            System.out.println("Enter Any key: From 0 - 25\n"
                    + "eg 23 for encoding and decoding THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG");
            mainObject.setKey(userInputObject.nextInt());

            System.out.println("Your Ceaser Cipher Program is Processing...");
            System.out.println(mainObject.getProcess());
            if (mainObject.getProcess().startsWith("e")){
                String output = Encoding.encode(mainObject.getMessage(), mainObject.getKey());
                System.out.println(output);
            } else if (mainObject.getProcess().startsWith("d")) {
                String output = Decoding.decode(mainObject.getMessage(), mainObject.getKey());
                System.out.println(output);
            } else {
                System.out.println("Your process is Invalid");
                continue;
            }
            System.out.println("Do you want to quit or continue the program");
            userInputObject.nextLine();
            String nextStep = userInputObject.nextLine();
            if (nextStep.startsWith("q")){
                break;
            }
        } while(true);
    }
}