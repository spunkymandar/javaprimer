//structure of Java program
//variable declaration & scoping

//control statements
//arraydemo : primitive
//working with loop
package org.example;

//import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    int x=10;

    public static void main(String[] args) {
        int y=20;
//        ifdemo(10,20,30);
//        simpleforloopdemo();
//        arraydemo();
        DBTest.connectDB();

    }

    private static void arraydemo() {
        int[] data=new int[10];
        int[] values={10,20,30}; //First class objects
        System.out.println(values);//prints references
        for(int i=0;i<values.length;i++){
            System.out.println(values[i]);
        }
    }


    private static void simpleforloopdemo() {
        for(int i=0;i<=10;i++){
            System.out.println("hello");
        }
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }

    private static void ifdemo(int x,int y,int z) {

        if(x>y){
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }

        if(x>y){
            System.out.println("a is greater");
        }
        else if(y>z){
            System.out.println("b is greater");
        }
        else{
            System.out.println("Numbers are equal");
        }

    }


}