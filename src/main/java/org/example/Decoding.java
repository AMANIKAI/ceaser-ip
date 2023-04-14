package org.example;

public class Decoding {
    private static String decodeAlphabets = "XYZABCDEFGHIJKLMNOPQRSTUVW";

    public static String decode(String msg, int key){
        String output = "";
        for(char c: msg.toCharArray()){
            int charPos = decodeAlphabets.indexOf(c);
            if (charPos == -1){
                output = output + c;
                continue;
            }
            int tempNewPos = charPos + key;
            int newPos = tempNewPos > 25 ?  tempNewPos % 26 : tempNewPos;
            char replacement = decodeAlphabets.charAt(newPos);
            output = output + replacement;
        }
        return output;
    }
}