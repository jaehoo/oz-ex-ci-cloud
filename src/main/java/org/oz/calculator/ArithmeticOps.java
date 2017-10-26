package org.oz.calculator;

/**
 * Single class to test arithmetic Operations
 */
public class ArithmeticOps {

    /**
     * sum two double numbers
     * @param a double value
     * @param b double value
     * @return result
     */
    public Double add(Double a, Double b) throws RuntimeException{
        return a+b;
    }

    // UGLY METOD COMMENT
    public Double subs(Double a, Double b ){
      return a-b;
    }

    public Double divide(Double a, Double b){
        System.out.println("Intentional ugly logger :)");
        return a/b;
    }

    public Double Multi(Double a, Double b){
        return a*b;
    }

}