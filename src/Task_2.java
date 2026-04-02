public class Task_2 {
    public static void main(String[] args) {
        int randomNumberManoj = (int)(Math.random() * 100) + 1;
        System.out.println("Step 1: Generated a random number: " + randomNumberManoj);
        System.out.println("Step 2: Checking if the number is even or odd using modulo...");
        if (randomNumberManoj % 2 == 0) {
            System.out.println("Result: The number " + randomNumberManoj + " is EVEN.");
        } else {
            System.out.println("Result: The number " + randomNumberManoj + " is ODD.");
        }
        System.out.println("\n--- Process Summary ---");
        System.out.println("Used Math.random() for generation and the '%' operator to check the remainder when divided by 2.");
    }
}