public class isSixtyFive {

    public class Main {

        public static boolean isSixtyFive(int num1, int num2) {

            return num1 == 65 || num2 == 65 || (num1 + num2) == 65;
        }

        public static void main(String[] args) {
            boolean result1 = isSixtyFive(20,45);
            boolean result2 = isSixtyFive(25,30);

            System.out.println(result1);
            System.out.println(result2);
        }
    }


}
