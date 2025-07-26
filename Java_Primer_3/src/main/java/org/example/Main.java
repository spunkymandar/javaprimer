//understanding cosmic super class Object
//working with oject equality : equals()
//understanding hashcdode
//working with enum
//exception handling: Throwable->Exception->CheckedException,UncheckedException, CustomException
package org.example;
public class Main {
    public static void main(String[] args) {
        //create the code to create object of coffee
        //Calculator c1;
        Coffee c;
        Coffee c1=Coffee.EXPPRESSO;
        c1.order(3);
        System.out.println("Total Bill:"+c1.getBill());

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Calculator calculator1 = new Calculator();
        calculator1.addNumbers(10, 2);
        calculator1.divNumbers(10, 0);
        try {
            calculator1.multiplyNumbers(10, 10);
        } catch (DuplicateValueException dve) {
            System.out.println(dve);
        }

    }

}