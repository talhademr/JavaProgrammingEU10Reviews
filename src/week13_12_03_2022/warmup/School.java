package week13_12_03_2022.warmup;

import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class School {
    /*
    2. create a class which is School with main method
    3. create a list of teacher in School class inside the STATIC BLOCK
    4. create a method in School class which is returning the list of teachers if the name start with "M"
    5. create a method in School class then you will find the female teachers
    6. create a method in School class then find the teachers age smaller than 30
    7. create a methot in School class then find the teachers born in 1967 year
     */
    static ArrayList<Teacher> teachers = new ArrayList<>();

    static {

        //     ArrayList<Teacher> teachers = new ArrayList<>();  bunu böyle yazamıyoruz çünkü main methodda göremeyiz böyle yaparsak
        Teacher teacher1 = new Teacher("Muhtar", "ABC", 'M', LocalDate.of(1990, 1, 17), 1L);
        Teacher teacher2 = new Teacher("talha", "asd", 'M', LocalDate.of(1987, 1, 17), 2L);
        Teacher teacher3 = new Teacher("aysun", "xcv", 'F', LocalDate.of(1988, 1, 17), 3L);
        Teacher teacher4 = new Teacher("asya", "caf", 'F', LocalDate.of(1976, 1, 17), 4L);
        Teacher teacher5 = new Teacher("saim", "ghj", 'M', LocalDate.of(1998, 1, 17), 5L);
        Teacher teacher6 = new Teacher("Asya", "Abc", 'F', LocalDate.of(1990, 1, 1), 6L);

        teachers.addAll(Arrays.asList(teacher2, teacher1, teacher5, teacher4, teacher3));

    }

    public static void main(String[] args) {
        System.out.println(teachers);

        ArrayList<Teacher> result = getTeachersNameStartWith("M");
        System.out.println(result);

        ArrayList<Teacher> females =getTeachersByGender('F');
        System.out.println(females);
    }

    private static ArrayList<Teacher> getTeachersByGender(char gender) {
        ArrayList<Teacher> result = new ArrayList<>();

        for (Teacher teacher : teachers) {
            if (teacher.gender==gender){
                result.add(teacher);
            }
        }
        return result;
    }

    private static ArrayList<Teacher> getTeachersNameStartWith(String prefix) {
        ArrayList<Teacher> result = new ArrayList<>();


        //I need to get teacher one by one
        for (Teacher teacher : teachers) {

            // I need to check the name if the name is starting with "M"
            if (teacher.name.startsWith(prefix))
                result.add(teacher);
        }

        return result;
    }




}
