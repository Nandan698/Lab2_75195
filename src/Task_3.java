public class Task_3 {

    public static void main(String[] args) {

        int amountOfBricksManoj = 75;

        int containerCapacityManoj = 8;

        System.out.println("Initialization: We have " + amountOfBricksManoj + " Lego bricks.");
        System.out.println("Initialization: Each container can hold " + containerCapacityManoj + " bricks.");

        int fullContainersManoj = amountOfBricksManoj / containerCapacityManoj;
        System.out.println("Step 1: Number of completely full containers = " + fullContainersManoj);

        int remainingBlocksManoj = amountOfBricksManoj % containerCapacityManoj;
        System.out.println("Step 2: Number of blocks in the non-full container = " + remainingBlocksManoj);

        int totalContainersManoj = (remainingBlocksManoj > 0) ? (fullContainersManoj + 1) : fullContainersManoj;
        System.out.println("Step 3: Total containers used (full and not full) = " + totalContainersManoj);

        System.out.println("\n--- Logic Explanation ---");
        System.out.println("Used '/' for integer division to find full sets.");
        System.out.println("Used '%' (modulo) to find the leftover bricks.");
    }
}