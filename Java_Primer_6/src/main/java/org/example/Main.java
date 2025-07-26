//advanced features of Java
//functional interfaces, lambdas, optional, vardemo, textblocks
package org.example;


import java.util.*;
import java.util.function.Consumer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        vardemo();
//        switchdemo();
//        textblockdemo();
//        functionaldemo();
        optionaldemo();


    }

    private static void functionaldemo() {
        Consumer<String> myConsumer= new Consumer<String>(){

            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        myConsumer.accept("abc");

        Consumer<String> printUppercase=(s)-> System.out.println(s);
        printUppercase.accept("abc");

        List<Integer> myList=Arrays.asList(10,20,40);

        myList.forEach((s)-> System.out.println(s));

    }

    private static void optionaldemo() {
        ArrayList<String> students = new ArrayList<>();
        students.add("John");
        students.add("Emily");
        students.add("Sophia");
        students.add("Daniel");
        String studentNameToFind = "Sophia";

        // Invoke the method to check if the student exists
        Optional<String> foundStudent = findStudent(students, studentNameToFind);
        if(foundStudent.isPresent()){
            System.out.println(foundStudent.get());
        }
        foundStudent.ifPresentOrElse((s)-> System.out.println(s), ()->System.out.println("Not present"));


    }

    private static Optional<String> findStudent(ArrayList<String> students, String name) {
        if (students.contains(name)) {
            return Optional.of(name);  // If found, wrap it in an Optional
        } else {
            return Optional.empty();  // If not found, return an empty Optional
        }
    }


    private static void textblockdemo() {
        String html= """
                <html>
                    <body>
                    </body>
                </html>
                """;
        System.out.println(html);

        String message= """
                hello from Java
                we are testing the text blocks
                """;
        System.out.println(message);
    }

    private static void switchdemo() {
        var day="TUESDAY";
        var result=switch(day){
            case "Monday","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY"->
                "Weekday";
            case "SATURDAY","SUNDAY"->
                "Weekend";
            default->"Unknown";

        };
        System.out.println(result);
    }

    private static void vardemo() {
        //pre jdk10
        ArrayList<String> students1=new ArrayList<String>();
        Map<Integer, String> employees1=new HashMap<Integer, String>();
        employees1.put(101,"John");
        employees1.put(102,"Willis");
        for(Map.Entry<Integer,String> entry: employees1.entrySet()){
            Integer id=entry.getKey();
            String name=entry.getValue();
            System.out.println(id+" , "+name);
        }

        //jdk10 onwards
        var students2=new ArrayList<String>();
        var employees2=new HashMap<Integer, String>();
        employees2.put(101,"John");
        employees2.put(102,"Willis");
        for(var entry: employees2.entrySet()){
            Integer id=entry.getKey();
            String name=entry.getValue();
            System.out.println(id+" , "+name);
        }




    }
}