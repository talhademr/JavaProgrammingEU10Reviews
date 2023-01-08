package week11_11_19_2022.student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class School {
    /*
2. create a class which is School with main method
3. create a list of student in School class
4. create a method in School class which is getting list of students as parameter the return the list of students if
the name starts with "A"
    */
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        //  LocalDate.of(2000,1,1)  ;
        Student student1=new Student("Osman",'M','A', LocalDate.of(2000,1,1),111);
        Student student2=new Student("Erdem",'M','B', LocalDate.of(1999,1,1),111);
        Student student3=new Student("Veli",'M','A', LocalDate.of(2000,1,1),111);
        Student student4=new Student("Cevriye",'F','C', LocalDate.of(2000,1,1),111);
        Student student5=new Student("Aygun",'F','D', LocalDate.of(2000,1,1),111);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        ArrayList<Student> result = getStudentsNameStartsWithA ( students);

        System.out.println(result);


    }

    public static ArrayList<Student> getStudentsNameStartsWithA(ArrayList<Student> students) {

        ArrayList<Student> result = new ArrayList<>();

        for (Student student : students) {
            if (student.name.startsWith("A")){
                result.add(student);
            }
        }
        return result;
    }
}
