import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> foods = new ArrayList<String>();

        foods.add("Burger");
        foods.add("Spaghetti");
        foods.add("Carbonara");

        foods.set(0, "Damn");
        foods.remove(1);
        foods.clear();


        for (int i = 0; i < foods.size(); i++){
            
            System.out.println(foods.get(i));
        }

    }
}