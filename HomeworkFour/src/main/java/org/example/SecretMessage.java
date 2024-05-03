package org.example;

public class SecretMessage {
    public static void main(String[] args) {

        String encrypted = "HPC PJVYMIY";
        String decodeTable = "BLMRGJIASOPZEFDCKWYHUNXQTV";

        String decrypted = decrypt(encrypted, decodeTable);
        System.out.println("decrypted = " + decrypted);
    }

    private static String decrypt(String encrypted, String decodeTable) {
        String decrypted = "";

        for (char c : encrypted.toCharArray()) {
            if (c == ' ') {
                decrypted += c;
            } else {
                int index = getAnAlphabetCharIndex(c);
                char decodedChar = decodeTable.charAt(index);
                decrypted += decodedChar;
//                decrypted += decodeTable.charAt(c - 65);
            }
        }
        return decrypted;
    }

    private static int getAnAlphabetCharIndex(char c) {
        return c - 65;
    }

}
