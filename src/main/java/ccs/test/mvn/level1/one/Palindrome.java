package ccs.test.mvn.level1.one;

public class Palindrome {
    /**
     * A Palindrome is a string which is same when you reverse it.
     * A few examples are : dad, mom.
     *
     * IMPORTANT : This should ignore case. So Malayalam should be treated as a palindrome.
     * By Default, in java "M" != "m", but in this test, "M" is same as "m"
     *
     * This program should take a inputString and figure out whether or not it is a palindrome.
     * if it is a palindrome, then set isPalindrome to true.
     *
     *
     *
     * @param input the input String
     * @return true if it is a palindrome, false if it is not.
     */

    public static void main(String args[]){


    }
    public static boolean isPalindrome(String input) {
        //TODO - Implement method.
        char[] word = input.toCharArray();
       int i1 = 0;
        int i2 = word.length - 1;
        while (i2 > i1) {
            if (word[i1] != word[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }
}
