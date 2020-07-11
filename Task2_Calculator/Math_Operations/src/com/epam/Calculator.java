package com.epam;

public class Calculator implements Maths_Operation {
    public void sum(int firstvalue,int secondvalue) {
        System.out.println("sum:"+(firstvalue+secondvalue));
    }
    public void difference(int firstvalue,int secondvalue) {
        System.out.println("Difference :"+(firstvalue-secondvalue));
    }
    public void product(int firstvalue,int secondvalue) {
        System.out.println("Product:"+(firstvalue*secondvalue));
    }
    public void divide(int firstvalue,int secondvalue) {
        try{
            if(secondvalue!=0)
            {
                System.out.println("Division:"+(firstvalue/secondvalue));
            }
            else{
                System.out.println ("You Shouldn't divide a number by zero");
            }
        }
        catch(ArithmeticException e){

        }
    }

}
