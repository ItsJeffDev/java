import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<String>();
        while (true) {
            System.out.print("Enter: ");
            String user = sc.nextLine();

            foods.add(user);
            System.out.println();

            for (int i = 0; i < foods.size(); i++) {
                System.out.println("----------");
                System.out.println(foods.get(i));
                System.out.println("----------");

                if (Sta)
            }
        }
    }
}