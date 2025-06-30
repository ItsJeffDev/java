public class Array {
    public static void main(String[] args) {
        /*
         * 
         * String student_Name[] = {"Jeff", "Reyjan", "May", "Ann", "Jazhmine"};
         * 
         * String number_Name[] = new String[5];
         * 
         * number_Name[0] = "Damn";
         * 
         * System.out.println(number_Name[0]);
         * 
         * String[] cars = {"BMW", "TOYOTA", "FERRARI"};
         * 
         * for (String x : cars){
         * System.out.println(x);
         * }
         */
        /*
         * int[] num = {12, 10, 5, 8, 9, 4};
         * 
         * int lower = num[0];
         * 
         * for (int age : num){
         * if (lower > age) {
         * lower = age;
         * }
         * }
         * System.out.println(lower);
         */

         int[][] num = {{1,2,3,4}, {5,6,7,8}};

         for (int i = 0; i < num.length; i++){
            for (int j = 0; j < num[i].length; j++){
                System.out.println(num[i][j]);
            }
         }
    }
}
