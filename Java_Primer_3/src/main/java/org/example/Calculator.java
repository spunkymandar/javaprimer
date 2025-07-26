package org.example;

public class Calculator {
    public void addNumbers(int x, int y){
        int ans=x+y;
        System.out.println("Addition="+ans);
    }
    public void subtractNumbers(int x, int y){
        int ans=x-y;
        System.out.println("Subtraction ="+ans);;
    }
    public void divNumbers(int x, int y){
        try {
            int ans = x / y;
            System.out.println("Division =" + ans);
        }
        catch(ArithmeticException ae){
            System.out.println("Number cannot be divided by zero");
        }
    }
    public void multiplyNumbers(int x, int y) throws DuplicateValueException {
        if(x==y)
            throw new DuplicateValueException();
        else
        {
            int ans=x*y;
            System.out.println("Both the values cannot be same");
        }
    }
}
