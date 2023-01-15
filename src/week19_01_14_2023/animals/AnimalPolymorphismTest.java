package week19_01_14_2023.animals;

public class AnimalPolymorphismTest {

    //implement polymorphism
    //ParentClass(Reference Type) reference = new SubClassConstructor();


    public static void main(String[] args) {

        Animal animal = new Bird();
        animal.move();
        animal=new Cow();
        animal.move();
        animal= new Fish();
        animal.move();

//======================================
        Animal animal1=new Bird();

        /*
        Reference type is deciding which methods are accessible.
        Object is deciding which methods are implemented.
         */

        //Reference Type casting
        ((Bird) animal1).hunt();


    }

}
