package ccs.test.mvn.level1.one;

public class FibbonacciNthNumber {

    /**
     * The series goes like: 1 1 2 3 5 8 13 21 ......
     *
     * if input is 1, output is 1
     * if input is 2, output is 1
     * if input is 3, output is 2
     * if input is 4, output is 3 and so on....
     *
     * @param nthNumber - the number for which fobonacci is calculated
     * @return the nth fibonacci number
     * @throws BadArgumentException if the input is < or = 0
     */




    public static int findFibbonacci(int nthNumber) throws BadArgumentException {

        int a = 1;
        int b=1;
        int s = 1;


        //TODO - Implement method.
        if (nthNumber<=0){
            throw new BadArgumentException("please give a decent number");
        }

        if (nthNumber == 1 || nthNumber ==2){
            return 1;
        }

        return (findFibbonacci(nthNumber-1)+findFibbonacci(nthNumber-2));

//        for (int i=3; i<=nthNumber; i++){
//            s= a+b;
//            b=a;
//            a=s;
////        }
//
//        return s;
    }
}
