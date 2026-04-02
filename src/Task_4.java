import java.math.BigDecimal;
import java.math.RoundingMode;
public class Task_4 {
    public static void main(String[] args) {
        double priceNetManoj = 9.99;
        double vatManoj = 0.23;
        int quantityManoj = 10000;
        double grossValueDoubleManoj = priceNetManoj * (1 + vatManoj);
        double totalGrossDoubleManoj = grossValueDoubleManoj * quantityManoj;
        double totalNetDoubleManoj = totalGrossDoubleManoj / (1 + vatManoj);
        System.out.println("--- Calculations using DOUBLE ---");
        System.out.println("Total Gross (10k pcs): " + totalGrossDoubleManoj);
        System.out.println("Total Net (after VAT removal): " + totalNetDoubleManoj);
        BigDecimal priceNetBDManoj = new BigDecimal("9.99");
        BigDecimal vatBDManoj = new BigDecimal("0.23");
        BigDecimal quantityBDManoj = new BigDecimal("10000");
        BigDecimal grossValueBDManoj = priceNetBDManoj.multiply(new BigDecimal("1.23"));
        BigDecimal totalGrossBDManoj = grossValueBDManoj.multiply(quantityBDManoj);
        BigDecimal totalNetBDManoj = totalGrossBDManoj.divide(new BigDecimal("1.23"), 2, RoundingMode.HALF_UP);
        System.out.println("\n--- Calculations using BIGDECIMAL ---");
        System.out.println("Total Gross (10k pcs): " + totalGrossBDManoj);
        System.out.println("Total Net (after VAT removal): " + totalNetBDManoj);
        System.out.println("\n--- Conclusion ---");
        if (totalNetDoubleManoj != totalNetBDManoj.doubleValue()) {
            System.out.println("The values are DIFFERENT.");
            System.out.println("The 'double' type suffers from binary rounding errors.");
            System.out.println("Always use BigDecimal for money to ensure mathematical accuracy!");
        }
    }
}