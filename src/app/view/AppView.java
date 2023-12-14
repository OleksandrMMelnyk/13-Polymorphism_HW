package app.view;

import java.util.Scanner;
import java.util.Locale;

public class AppView {

    private final Scanner sc = new Scanner(System.in);

    public int getData() {
        System.out.println("""
               Enter the number model: 
               number 1 - Device MODEL_A
                          or
               number 2 - Device MODEL_B
               *************************
                """);
        sc.useLocale(Locale.ENGLISH);
        return sc.nextInt();
    }

    public double[] getVariant() {
        System.out.print("Enter the first value: ");
        sc.useLocale(Locale.ENGLISH);
        double variantFirst = sc.nextDouble();
        System.out.print("Enter the second value: ");
        sc.useLocale(Locale.ENGLISH);
        double variantSecond = sc.nextDouble();
        return new double[]{variantFirst, variantSecond};
    }

    public void getOutput(String output) {
        sc.close();
        System.out.println(output);
    }
}
