package week11_11_19_2022.custom_class;

import java.util.ArrayList;

public class FirstClass {

    public int a;

    public String b;

    public SecondClass secondClass;

    public ArrayList<Integer> arrayList;

    //short cut for creating cons
    //for mac : command+N
    //for win :alt+insert


    public FirstClass(int a, String b, SecondClass secondClass) {
        this.a = a;
        this.b = b;
        this.secondClass = secondClass;
    }





    @Override
    public String toString() {
        return "FirstClass{" +
                "a=" + a +
                ", b='" + b + '\'' +
                ", secondClass=" + secondClass +
                ", arrayList=" + arrayList +
                '}';
    }
}
