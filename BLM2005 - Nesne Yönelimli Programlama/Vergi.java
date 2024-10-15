import java.text.DecimalFormat;

public class Vergi {
    public static void main(String[] args) {
        double salesAmount = 100.0; // Example sales amount
        double taxRate = 0.18; // Example tax rate (18%)

        double salesTax = salesAmount * taxRate;

        DecimalFormat df = new DecimalFormat("#.00");
        String formattedSalesTax = df.format(salesTax);

        System.out.println("Satis Vergisi: " + formattedSalesTax);
    }
}
