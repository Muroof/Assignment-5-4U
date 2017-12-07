
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Maloof
 */
public class A5Q3 {

    public boolean inLang(String word) {
        // initialize the stack
        Stack<Character> stack = new Stack<>();

        // create two strings to store the orginal word, and one to store it reversed
        String originalWord = "";
        String reverseWord = "";

        // if the word doesn't contain a '$', automatically return false
        if (word.charAt(word.length() / 2) != '$') {
            return false;

        } else {
            // takes the first half of the word, in characters, into the stack
            for (int i = 0; i < word.length() / 2; i++) {
                stack.push(word.charAt(i));
            }
            // the first half of the word is then popped out of the stack, reversing it's order
            for (int i = 0; i < word.length() / 2; i++) {
                // store this word as 'originalWord'
                originalWord += stack.pop();

            }
            // takes the second half of the word, and stores it as reverse string
            reverseWord = word.substring((word.length() / 2) + 1, word.length());

            // compare the two strings 'originalWord' and 'reverseWord'
            // if they are the same
            if (reverseWord.equals(originalWord)) {
                // return true
                return true;

                // otherwise return false
            } else {
                return false;
            }
        }

    }

    public static void main(String[] args) {
        A5Q3 testing = new A5Q3();

        System.out.println(testing.inLang("chat$$$tahc"));

    }

}
