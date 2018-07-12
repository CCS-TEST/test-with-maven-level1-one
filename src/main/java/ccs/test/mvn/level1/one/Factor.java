package ccs.test.mvn.level1.one;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Factor {
    /**
     * Factoring of integers. Write a program that takes an integer and then returns all its factors (only +ve)
     * in increasing order as a List of integers.
     *
     * For example, when the user enters 150, the program should
     * return a list of integer with the following numbers:
     * 1
     * 2
     * 3
     * 5
     * 6
     * 10
     * 15
     * 25
     * 30
     * 50
     * 75
     * 150
     *
     * @param multiple - the input to the method. must check for positive
     * @return a list of factors.
     * @throws BadArgumentException if the input is < or = 0;
     */
    public static List<Integer> getAllFactors(int multiple) throws BadArgumentException{

        List<Integer> factors = new ArrayList<>();

        if (multiple<=0){
            throw new BadArgumentException("give decent no. bruh");
        }

        for (int i =1; i<= multiple; i++){
            if (multiple%i == 0){
                factors.add(i);
            }
        }

        return factors;
    }
}
