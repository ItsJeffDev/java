public class Word {
    public static void main(String[] args) {
        /* For Loop */
        /*
         * 1 2 3
         * 2 4 6
         * 3 6 9
         */
        /*
         * for (int i = 1; i <= 3; i++){
         * for (int x = 1; x <= 3; x++){
         * System.out.print(i * x + " ");
         * }
         * System.out.println();
         * }
         * 
         */

        /* For Each */
        /*
         * String[] cars = {"BMW", "TOYOTA", "FERRARI"};
         * 
         * for (String c : cars){
         * System.out.println(c);
         * }
         * 
         */

        /* Loop Through an Array */
        /*
         * String[] cars = {"BMW", "TOYOTA", "FERRARI"};
         * 
         * for (int i = 0; i < cars.length; i++){
         * System.out.println(cars[i]);
         * }
         * 
         */
        /*
         * String[] cars = {"BMW", "TOYOTA", "FERRARI"};
         * for (String c : cars){
         * System.out.println(c);
         * }
         * System.out.println(cars.length);
         * 
         */

        /* create a program that finds the lowest age among different ages */

        int ages[] = { 20, 22, 18, 35, 48, 26, 87, 70 };

        int wide = ages.length;

        int lowest = ages[0];

        for (int age : ages) {
            if (lowest > age) {
                lowest = age;
            }
        }
        System.out.println(lowest);
    }

}
