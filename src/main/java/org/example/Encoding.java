package org.example;

public class Encoding {
    public static String getAlphabets() {
        return alphabets;
    }

    public static void setAlphabets(String alphabets) {
        Encoding.alphabets = alphabets;
    }

    private static String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String encode(String msg, int key){
        String output = "";
        for(char c: msg.toCharArray()){
            int charPos = alphabets.indexOf(c);
            if (charPos == -1){
                output = output + c;
                continue;
            }
            int tempNewPos = charPos + key;
            int newPos = tempNewPos > 25 ?  tempNewPos % 26 : tempNewPos;
            char replacement = alphabets.charAt(newPos);
            output = output + replacement;
        }
        return output;
    }
}
