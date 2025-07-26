//limitations of array
//Collection : List-> ArrayList, Set-> HashSet,
//Arraylist demonstration of object 
//Map : Key, value (Map is not subtype of Collection)

package org.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.util.Employee;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        arrylistdemo();
        mapdemo();

    }

    private static void mapdemo() {
        Map<Integer, String> studentMap=new HashMap<Integer,String>();
        studentMap.put(101,"Rakesh");
        studentMap.put(102,"vikas");
        System.out.println(studentMap);
        for(Map.Entry<Integer,String> entry:studentMap.entrySet()){
            System.out.println(entry.getKey() +" , "+entry.getValue());
        }


    }

    private static void arrylistdemo() {
        List<String> studentList=new ArrayList<String>();
        studentList.add("John");
        studentList.add("Derek");
        studentList.add("Willis");
        for(int i=0;i<studentList.size();i++)
            System.out.println(studentList.get(i));

        System.out.println(studentList);

        for(String s:studentList)
            System.out.println(s);

        studentList.forEach((s)-> System.out.println(s));

        List<Employee> empList=new ArrayList<Employee>();
        empList.add(new Employee(1,"JOhn"));
        empList.add(new Employee(2,"Derek"));
        System.out.println(empList);
        for (Employee employee : empList) {
            System.out.println(employee);

        }
    }
}