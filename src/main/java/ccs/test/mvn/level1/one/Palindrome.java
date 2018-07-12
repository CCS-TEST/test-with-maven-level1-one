package ccs.test.mvn.level1.one;

public class Palindrome {
    /**
     * A Palindrome is a string which is same when you reverse it.
     * A few examples are : dad, mom.
     * <p>
     * IMPORTANT : This should ignore case. So Malayalam should be treated as a palindrome. By Default, in java "M" != "m", but in this test, "M" is same as "m"
     * <p>
     * This program should take a inputString and figure out whether or not it is a palindrome.
     * if it is a palindrome, then set isPalindrome to true.
     *
     * @param input the input String
     * @return true if it is a palindrome, false if it is not.
     */
    public static boolean isPalindrome(String input) {
        //TODO - Implement method.
        //Todo: check outer to inner from in and out when not, exit and return false
        input = input.toLowerCase();

        int lastIndex = input.length()-1;


        for (int i = 0; i <= input.length()/2; i++) {
            if (input.charAt(i) != input.charAt(lastIndex - i)){
                return false;
        }
    }
        return true;

    }
}



/***
 * If i can not subtract length of input to -1 because of out of bounds exception then:
 * i++ -> lengthOfInput --
 * length of input - i
 * i starts out at 0 so subtract i and 1
 */