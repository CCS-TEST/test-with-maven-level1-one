package ccs.test.mvn.level1.one;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

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
            int divider = 1;
        List cow = new ArrayList(multiple);
            while(divider <= multiple){
                if(multiple%divider==0){
                    cow.add(divider);
                }
                divider++;
            }

            return cow;

    }


}
