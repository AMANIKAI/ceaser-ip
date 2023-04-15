package org.example;

public class Encoding {
    private static final String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String encode(String msg, int key){
        StringBuilder output = new StringBuilder();
        for(char c: msg.toCharArray()){
            int charPos = alphabets.indexOf(c);
            if (charPos == -1){
                output.append(c);
                continue;
            }
            int tempNewPos = charPos + key;
            int newPos = tempNewPos > 25 ?  tempNewPos % 26 : tempNewPos;
            char replacement = alphabets.charAt(newPos);
            output.append(replacement);
        }
        return output.toString();
    }
}
