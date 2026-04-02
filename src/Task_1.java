public class Task_1 {
    static float earthWeightManoj;
    static float marsWeightFloatManoj;
    static double marsWeightDoubleManoj;
    static int marsWeightIntManoj;
    static char marsWeightCharManoj;
    static int finalMathResultManoj;

    public static void main(String[] args) {

        earthWeightManoj = 75.5f;
        float marsGravityRatio = 0.38f;

        System.out.println("Variable Initialization: Earth weight set to " + earthWeightManoj + " kg.");

        marsWeightDoubleManoj = earthWeightManoj * marsGravityRatio;
        System.out.println("Calculation: Weight on Mars calculated and stored as a double.");

        System.out.format("Mars Weight (double) limited to 4 decimal places: %.4f%n", marsWeightDoubleManoj);

        marsWeightIntManoj = (int) marsWeightDoubleManoj;
        System.out.println("Casting: Double value casted to int type: " + marsWeightIntManoj);

        marsWeightCharManoj = (char) marsWeightIntManoj;
        System.out.println("Casting: Int value casted to char type: " + marsWeightCharManoj);

        finalMathResultManoj = marsWeightCharManoj + 10;
        System.out.println("Math Operation: Added 10 to the char variable. Resulting int value: " + finalMathResultManoj);
    }
}