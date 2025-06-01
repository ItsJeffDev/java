
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
        
        for (String x : unknown){
            if (unknown.toString().startsWith("Hello")){
                System.out.println("work");
            }
        }
    }
}