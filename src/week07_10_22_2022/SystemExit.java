package week07_10_22_2022;

public class SystemExit {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            if ( i==3 )
                System.exit(0);

            System.out.println(i);
        }
        System.out.println("after break");
    }
}
