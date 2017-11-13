
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

        Stack<Character> stack = new Stack<>();
        
 
//            if(word.indexOf("$"))
    
        

        if (word.length() != 0 && word.charAt(word.length() / 2) == '$') {

            char[] letters = new char[word.length()];

            for (int i = 0; i < word.length(); i++) {

                letters[i] = word.charAt(i);
                stack.push(letters[i]);

            }
            char[] check = new char[word.length()];
            for (int i = 0; i < word.length(); i++) {
                check[i] = stack.pop();

            }
            for (int i = 0; i < check.length; i++) {
                if (letters[i] != check[i]) {
                    return false;

                }

            }
            return true;

        }
        return false;

    }

    public static void main(String[] args) {
        A5Q3 testing = new A5Q3();

        System.out.println(testing.inLang("tap$$pat"));

    }

}
