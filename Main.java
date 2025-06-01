import java.util.*;
public class Main {
    public static void main(String[] args){
        /*
          Write a Java program that takes a string input,
          trims it, checks if it starts with "Hello",
          and prints the position of the word 
          "world" in the string.
         */



         /* Input: 
            "   Hello, world!   "
         
            Output:  
            Trimmed String: "Hello, world!" 
            Starts with "Hello": true 
            Position of "world": 8
         */

         //Code!!!

        String[] unknown = {"   Hello, world!   "};
        List<String> list1 = new ArrayList<String>();

        for (String x : unknown){
            list1.add(x.trim());
            if (x.startsWith("Hello")){
                for (int i = 0; i < list1.size(); i++){
                    list1.get()
                }
            }
        }
    }
}