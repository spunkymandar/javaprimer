//Working with Strings: declaring, concatenating,
//String API : equals(), String.format(), split()
//Creating classes and objects: variable scope, access modifiers, method invocation
//creating array of objects and iterating through it.
//essentials of class: attributes, behaviour, constructor, getter/setters, toString,
//POJO
//using records 
package org.example;

import java.sql.DriverManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        stringDemos();
        Employee employee1=new Employee();
        Employee employee2=new Employee(101,"John");
        BankAccount account1=new BankAccount("John",101);
        BankAccount account2=new BankAccount("Derek",102);
        System.out.println(BankAccount.getTotalAccounts());




    }

    private static void stringDemos() {
        //first class object
        //declaration
        String s1=new String("Learn Java Programming");
        String s2="Learn Java Programming";
        System.out.println(s1.equals(s2));//check also with == operator
        System.out.println(s1.charAt(2));
        System.out.println((s1.toUpperCase()));
        System.out.println(s1);
        System.out.println(s1.substring(6,10));
        String[] words= s1.split(" ");
        for(String s:words){
            System.out.println(s);
        }
        String s3=String.format("The value =%.2f",87.234);
        System.out.println(s3);
    }
}