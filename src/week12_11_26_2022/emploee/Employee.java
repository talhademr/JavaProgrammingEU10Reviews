package week12_11_26_2022.emploee;

public class Employee {
    public String name;
    public int id;
    public char gender;

    public Employee(String name, int id, char gender) {
        this.name = name;
        this.id = id;
        this.gender = gender;
    }

    public Employee ( String name){
        this.name = name;
    }

    public  Employee ( String name, int id){
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gender=" + gender +
                '}';
    }

    /*
We can overload toString method but if you want to see the result we need to call it
    public String toString(String name) {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gender=" + gender +
                '}';
    }
 */


}
