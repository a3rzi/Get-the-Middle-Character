package org.example;

public class Main {
    public static void main(String[] args) {
        //given
        //You are going to be given a word.
        String word = "maryam";
        //when
        //Your job is to return the middle character of the word
       String middleCharacter =getMiddle(word);
        System.out.println("the middle character is:" + middleCharacter);
    }

    private static String getMiddle(String word) {
        int length =word.length();
        if (length % 2 == 1){
            // Word length is odd
            int middle = length/2;
            return word.substring(middle,middle+1);
        }
        else {
            // Word length is even
            int middle = length/2;
            return word.substring(middle-1,middle+1);
        }
    }
}